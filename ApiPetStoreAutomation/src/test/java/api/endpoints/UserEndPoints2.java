package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ResourceBundle;

import api.payload.UserPOJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


//Created for perform Create,Retrieve,Update,Delete request to the user API

public class UserEndPoints2 {

	
	static ResourceBundle getURL() {
		
		ResourceBundle routes = ResourceBundle.getBundle("routes");
		return routes;
		
	}
	
	
	
	public static Response  createUser(UserPOJO payload) {
		
		String post_url = getURL().getString("post_url");
		
		Response res = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(post_url);
		
		return res;
	}
	
	
	public static Response Readuser(String userName) {
		
		String get_url = getURL().getString("get_url");
		
		Response res = given()
		.pathParam("username", userName)
		
		.when()
		.get(get_url);
		return res;
	}
	
	public static Response UpdateUser(String userName,UserPOJO payload) {
		
		String update_url = getURL().getString("update_url");
		
		Response res = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.pathParam("username", userName)
				
				.when()
				.put(update_url);
				
				return res;
	}
	
	public static Response DeleteUSer(String userName) {
	
		String delete_url = getURL().getString("delete_url");
		
		Response res = given()
				
				.pathParam("username", userName)
				
				.when()
				.delete(delete_url);
		
		return res;
	}
}