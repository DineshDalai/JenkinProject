package day2;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class PostRequestUsingJsonObject {

	
	@Test(priority=1)
	public void PostRequest_using_json() {
		
		JSONObject data = new JSONObject();
		data.put("name", "Ravi");
		data.put("location", "London");
		data.put("phone", "30303030");
		
		String courseArr[] = {"paint","Drawing"};
		data.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("http://localhost:3000/students")
		
		
		.then()
		.statusCode(201)
		.body("name", equalTo("Ravi"))
		.body("location", equalTo("London"))
		.body("phone", equalTo("30303030"))
		.body("courses[0]", equalTo("paint"))
		.body("courses[1]", equalTo("Drawing"))
		.header("Content-Type", "application/json; charset=utf-8")
		.log().all();
		
		
	}
	
	@Test(priority=2)
	public void DeleteRequest() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/students/4")
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
