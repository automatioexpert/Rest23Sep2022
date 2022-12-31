package studentApiTest;

import org.testng.annotations.Test;

import apiCongfigs.APIPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITest {

	@Test
	public void getAPITest() {

	 RestAssured.given()
				.when()
				.get(APIPath.apiPath.POST_COMMENTS)
			.then()
			.log()
			.all()
			.statusCode(200);
		
		
		//System.out.println(response.getSessionId());
	//	System.out.println(response.getStatusCode());
		
	//	response.prettyPrint();
		

	}

}
