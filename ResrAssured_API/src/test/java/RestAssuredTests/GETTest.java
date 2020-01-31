package RestAssuredTests;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


/*
 * given()

    set cookies, set headers, add authorizations, add params etc

when()

    get, put, post , delete…

Then()

    validate status code, extract response, response body, response cookies, response headers
    
 */
public class GETTest {
	
	@Test
	public void Getinformation()
	{
		given()
		.when()
			.get("https://reqres.in/api/users/1")
		.then()
			.assertThat()//.statusCode(equalTo(200))
			.statusCode(200)
			.and()
			.statusLine("HTTP/1.1 200 OK")
			.and()
			.body("data.email", equalTo("george.bluth@reqres.in"))
			.and()
			.header("Content-Type",equalTo("application/json; charset=utf-8"));
		
	}
	

}
