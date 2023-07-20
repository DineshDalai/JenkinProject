package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payload.UserPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//Created for perform Create,Retrieve,Update,Delete request to the user API

public class UserEndPoints {

	public static Response  createUser(UserPOJO payload) {
		
		
		Response res = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(Routes.post_url);
		
		return res;
	}
	
	
	public static Response Readuser(String userName) {
		
		Response res = given()
		.pathParam("username", userName)
		
		.when()
		.get(Routes.get_url);
		return res;
	}
	
	public static Response UpdateUser(String userName,UserPOJO payload) {
		
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.pathParam("username", userName)
				
				.when()
				.put(Routes.update_url);
				
				return res;
	}
	
	public static Response DeleteUSer(String userName) {
	
		Response res = given()
				
				.pathParam("username", userName)
				
				.when()
				.delete(Routes.delete_url);
		
		return res;
	}
}
