package RestAssuredTests;

import RestUtils.RestUtil;
import static io.restassured.RestAssured.given;
import net.minidev.json.JSONObject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PUTTest
{
	public String putName ;
	public String putJob;
	PostTest postTestObj = new PostTest();
	RestUtil restUtil = new RestUtil();
	@BeforeMethod
	public void setUp()
	{
		
	    putName = restUtil.name;	    
	    putJob = restUtil.Job+"_updated";	
	    RestUtil.postMap.clear();
	    RestUtil.jsonData = new JSONObject();
	    RestUtil.jsonData.clear();
	    RestUtil.postMap.put(putName, putJob);
	    RestUtil.jsonData = new JSONObject(RestUtil.postMap);
	}
	
	@Test
	public void PutData()
	{	
		given()		
			.contentType("application/json; charset=utf-8")
			//.baseUri("https://reqres.in/api/users")
			.body(RestUtil.jsonData)
		.when()	
			.put("https://reqres.in/api/users")
		.then()
			.assertThat()			
			.statusCode(200)
			.and()
			.statusLine("HTTP/1.1 200 OK");
		
	}
}