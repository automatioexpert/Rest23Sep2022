package Apis;

import static io.restassured.RestAssured.baseURI;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test2 {

	public static void main(String[] args) {
		baseURI="https://reqres.in/api";
		
		
		Response response=RestAssured.given().param("param", "2").when().get("/users");
		
		///System.out.println(response.getBody().asString());
		System.out.println("Response code 	is : "+response.getStatusCode());
		System.out.println("Content type: "+response.getContentType());
		System.out.println("Time is : "+response.getTime());
		System.out.println("Cookies is: "+response.cookies());
		System.out.println(response.prettyPrint());
		
//		RestAssured.given()
//		.param("page", "2")
//		.when()
//		.get("/users")
//		.then()
//		.assertThat()
//		.log()
//		.all()
//		.statusCode(200);
//		
		
		
		
	}

}
