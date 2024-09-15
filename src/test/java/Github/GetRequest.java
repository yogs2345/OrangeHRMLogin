package Github;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
public class GetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://api.github.com";
		Response response=given()
		.header("Accept","application/vnd.github+json")
		.header("Authorization","Bearer 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")
		.header("X-GitHub-Api-Version","2022-11-28")
		.when()
		.get("/repos/OWNER/REPO")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
	     .extract().response();
		
		 System.out.println("Status Code: " + response.getStatusCode());
		 Assert.assertEquals(200,response.getStatusCode());
				

	}


	}


