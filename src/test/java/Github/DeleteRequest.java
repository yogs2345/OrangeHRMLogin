package Github;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class DeleteRequest {
	

	
	    public static void main(String[] args) {
	        // Base URI of the REST API
	        RestAssured.baseURI = "https://api.github.com";

	        // JSON payload
	        String requestBody = "{\"name\":\"Hello-World\",\"description\":\"This is your first repository\",\"homepage\":\"https://github.com\",\"private\":false,\"has_issues\":true,\"has_projects\":true,\"has_wiki\":true}";

	        // Sending POST request
	        Response response = given()
	                .header("Accept", "application/vnd.github+json")
	                .header("X-GitHub-Api-Version","2022-11-28")
	                .header("Authorization","Bearer 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")
	              
	                .body(requestBody)
	                .when()
	                .post("/orgs/ORG/repos")
	                .then()
	                .log().all()
	                .extract().response();
	                

	        // Print the response status code
	        System.out.println("Status Code: " + response.getStatusCode());

	        // Print the response body
	        System.out.println("Response Body: " + response.getBody().asString());
	    }
	


	

	    public static void deleteMethod1() {

	        // Set the base URI
	        RestAssured.baseURI = "https://api.github.com"; // Replace with your base URL

	        // DELETE request
	        Response response = given()
	            .header("Accept", "application/vnd.github+json")  // Set header (if required)
	            .header("Authorization", "Bearer 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") // Optional: Add token for authorization
	            .header("X-GitHub-Api-Version","2022-11-28")
	            .when()
	            
	            .delete("/repos/yogs2345/Hello-World")  // Endpoint with the specific ID (user with id 1)
	            .then()
	            .assertThat()
	            .statusCode(204)  // Assert that the status code is 200 (OK)
	            .log().all()      // Log the response
	            .extract().response();

	        // Print response if needed
	        System.out.println("Response Body: " + response.getBody().asString());
	    }
	    public static void deleteMethod2() {

	        // Set the base URI
	        RestAssured.baseURI = "https://api.github.com/repos/yogs2345/Hello-World"; // Replace with your base URL

	        // DELETE request
	        Response response = given()
	            .header("Accept", "application/vnd.github+json")  // Set header (if required)
	            .header("Authorization", "Bearer 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") // Optional: Add token for authorization
	            .header("X-GitHub-Api-Version","2022-11-28")
	            .when()
	            
	            .delete()  // Endpoint with the specific ID (user with id 1)
	            .then()
	            .assertThat()
	            .statusCode(204)  // Assert that the status code is 200 (OK)
	            .log().all()      // Log the response
	            .extract().response();

	        // Print response if needed
	        System.out.println("Response Body: " + response.getBody().asString());
	    }
	}



		
		

	


