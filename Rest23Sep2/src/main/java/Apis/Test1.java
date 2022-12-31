package Apis;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test1 {

	@Test
	public void testStatusCode() {

		baseURI="https://reqres.in/";
		given().
		when()
			.get("/api/users/2")
		.then()
			.assertThat().statusCode(200)
			.log()
			.all();
		
		
		
	}

}
