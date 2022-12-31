package Apis;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PostRequestAutomation {
	
	@Test
	public void postAPI() {
		baseURI="https://reqres.in/api";
		
	String postBody="{\r\n"+ "\"name\": \"morpheus\",\r\n"+ "\"job\":\"leader\"\r\n"
			+ "}";
		
	given()
	.body(postBody)
	.when()
	.post("/users")
	.then()
	.assertThat()
	.log()
	.all()
	.statusCode(201);
	
	
		
	}

}
