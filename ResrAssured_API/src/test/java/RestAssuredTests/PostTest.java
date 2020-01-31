package RestAssuredTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RestUtils.RestUtil;
import io.restassured.response.ValidatableResponse;
import net.minidev.json.JSONObject;
import org.hamcrest.Matchers.*;

public class PostTest {
		
	RestUtil restUtil = new RestUtil();
	public String postName ;
	public String postJob;
	@BeforeMethod
	public void setUp()
	{
		//+": {"+"id"
		/*
		 * postMap.put("id", String.valueOf(restUtil.ID())); postMap.put("email",
		 * restUtil.EMail()); postMap.put("first_name", restUtil.FirstName());
		 * postMap.put("last_name", restUtil.LastName()); postMap.put("avatar",
		 * "https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg");//+"}"
		 * 
		 */
		postName = restUtil.Name();
		postJob = restUtil.Job();
		RestUtil.postMap.put("name", postName);
		RestUtil.postMap.put("job", postJob );
		RestUtil.jsonData = new JSONObject(RestUtil.postMap);
		
	}
	@Test
	public void PostData()
	{
		given()		
			.contentType("application/json; charset=utf-8")
			//.baseUri("https://reqres.in/api/users")
			.body(RestUtil.jsonData)
		.when()	
			.post("https://reqres.in/api/users")
		.then()
			.assertThat()			
				.statusCode(201)
				.and()
				.statusLine("HTTP/1.1 201 Created");
				
				//ValidatableResponse bodyMsg = given().contentType("application/json; charset=utf-8").body(RestUtil.jsonData)
				//				.when().post("https://reqres.in/api/users")
				//				.then().assertThat().body("SuccessCode", org.hamcrest.Matchers.equalTo(null));//OPERATION_SUCCESS
				//System.out.print(bodyMsg.toString());
				//.and()
				//.body("SuccessCode", org.hamcrest.Match22ers.equalTo("OPERATION_SUCCESS"))
			//	.and()
			//	.body("message", org.hamcrest.Matchers.equalTo("Operation completed successfully"));
				
	}

//	@AfterMethod
//	public void TearDown()
//	{
//		postMap.clear();
//		jsonData.clear();
//	}
}





