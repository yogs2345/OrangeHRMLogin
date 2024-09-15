package Github;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PutRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI=" https://api.github.com";
		String requestBody="{\"name\":\"Hello-World\",\"description\":\"This is your first repository\",\"homepage\":\"https://github.com\",\"private\":true,\"has_issues\":true,\"has_projects\":true,\"has_wiki\":true}";
        Response response=given()
        .
        		
	}

}
