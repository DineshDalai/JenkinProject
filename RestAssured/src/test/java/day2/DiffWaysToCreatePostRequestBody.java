package day2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;



//1) Post Request body using HashMap
public class DiffWaysToCreatePostRequestBody {

	public String id;
	
	//@Test(priority=1)
	public void PostUsingHashMap() {
		
		
		HashMap data = new HashMap();
		data.put("name", "Dinesh");
		data.put("Location", "France");
		data.put("phone", "123456");
		
		
		String courseArr[] = {"c","c++"};
		data.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("http://localhost:3000/students")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("Dinesh"))
		.body("Location", equalTo("France"))
		.body("phone",equalTo("123456"))
		.body("courses[0]",equalTo("c"))
		.body("courses[1]",equalTo("c++"))
		.header("Content-Type", "application/json; charset=utf-8")
		
		.log().all();
	}
	
	
	
	//2) Post Request body using org.json libary
	

	//	@Test(priority=1)
		public void PostUsingJsonLibary() {
			
			
			JSONObject data = new JSONObject();
			data.put("name", "Dinesh");
			data.put("Location", "France");
			data.put("phone", "123456");
			
			
			String courseArr[] = {"c","c++"};
			data.put("courses", courseArr);
			
			given()
			.contentType("application/json")
			.body(data.toString())
			
			.when()
			.post("http://localhost:3000/students")
			
			.then()
			.statusCode(201)
			.body("name", equalTo("Dinesh"))
			.body("Location", equalTo("France"))
			.body("phone",equalTo("123456"))
			.body("courses[0]",equalTo("c"))
			.body("courses[1]",equalTo("c++"))
			.header("Content-Type", "application/json; charset=utf-8")
			
			.log().all();
		}
	
	
		
		//3) Post Request body using POJO Class
		

			//@Test(priority=1)
			public void PostUsingPOJO() {
				
				POJOPostRequest data = new POJOPostRequest();
				data.setName("Dinesh");
				data.setLocation("France");
				data.setPhone("123456");
				
				String courseArr[] = {"c","c++"};
				data.setCourses(courseArr);
				
				given()
				.contentType("application/json")
				.body(data)
				
				.when()
				.post("http://localhost:3000/students")
				
				.then()
				.statusCode(201)
				.body("name", equalTo("Dinesh"))
				.body("Location", equalTo("France"))
				//.body("location", equalTo("France"))     //Location 'L' small letter only for POJO class 
				.body("phone",equalTo("123456"))
				.body("courses[0]",equalTo("c"))
				.body("courses[1]",equalTo("c++"))
				.header("Content-Type", "application/json; charset=utf-8")
				
				.log().all();
			}
		
		
		
			//4) Post Request body using External Json File
			

			@Test(priority=1)
			public void PostUsingExternalJSONFile() throws FileNotFoundException {
				
				File f = new File(".\\body.json");
				FileReader fr =new FileReader(f);
				JSONTokener jt = new JSONTokener(fr);
				JSONObject data = new JSONObject(jt);
				
				given()
				.contentType("application/json")
				.body(data.toString())
				
				.when()
				.post("http://localhost:3000/students")
				
				.then()
				.statusCode(201)
				.body("name", equalTo("Dinesh"))
				.body("Location", equalTo("France"))
				//.body("location", equalTo("France"))     //Location 'L' small letter only for POJO class 
				.body("phone",equalTo("123456"))
				.body("courses[0]",equalTo("c"))
				.body("courses[1]",equalTo("c++"))
				.header("Content-Type", "application/json; charset=utf-8")
				
				.log().all();
			}
		
		
		
			
			
	
	//Delete the Request
	@Test(priority=2)
	public void testDelete() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/students")
		
		
		.then()
		
		.statusCode(200)
		.log().all();
	}
		
	
}