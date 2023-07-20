package day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class DiffWaysToCreatePostRequest {

	
	@Test(priority=1)
	public void testPostRequestUsingHashmap() {
		
		HashMap data = new HashMap();
		data.put("name", "Ashok");
		data.put("location", "scotland");
		data.put("phone", "58585858");
		
		String courseArr[] = {"paint","Drawing"};
		data.put("courses", courseArr);
		
		
		given()
		.contentType("application/json")
		.body(data)
	
		
		.when()
		.post("http://localhost:3000/students")
		
		
		.then()
		.statusCode(201)
		.body("name", equalTo("Ashok"))
		.body("location", equalTo("scotland"))
		.body("phone", equalTo("58585858"))
		.body("courses[0]", equalTo("paint"))
		.body("courses[1]", equalTo("Drawing"))
		.header("Content-Type", "application/json; charset=utf-8")
		.log().all();
		
	
				
	}
	
	@Test(priority=2)
	public void testDelete() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/students/4")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
}
