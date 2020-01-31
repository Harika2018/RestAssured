package RestAssuredTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteTest {
	
	
	@Test
	public void DeleteData()
	{	
		given()					
		.when()	
			.delete("https://reqres.in/api/users/2")
		.then()
			.assertThat()			
			.statusCode(204)
			.and()
			.statusLine("HTTP/1.1 204 No Content");
	}

}
