package day2;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class PostRequestUsingPoJo {

	@Test(priority = 1)
	public void testusingPojo() {
		
		POJOClass obj = new POJOClass();
		obj.setName("Madhav");
		obj.setLocation("NZ");
		obj.setPhone("78787878");
		
		String courseArr[] = {"paint","Drawing"};
		
		obj.setCourse(courseArr);
		
		given()
	    .contentType("application/json")
		.body(obj)
		
		.when()
		.post("http://localhost:3000/students")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("Madhav"))
		.body("location", equalTo("NZ"))
		.body("phone", equalTo("78787878"))
		.body("course[0]", equalTo("paint"))
		.body("course[1]", equalTo("Drawing"))
		
		
		.log().all();
		
	}
	
	@Test(priority = 2)
	public void DeleteRequest() {
		
		given()
		
		.when()
		.delete("http://localhost:3000/students/4")
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
