package day1;

import  org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HttpRequest {

	int id;
	
	@Test(priority=1)
	public void getuser() {
		
		given()
	
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}
	
	
	@Test(priority=2)
	public void CreateUser() {
		
		
		HashMap map = new HashMap();
		map.put("name", "pavan");
		map.put("job", "trainer");
		
		id = given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		
		/*.then()
		.statusCode(201)
		.body("name", equalTo("pavan"))
		.body("job",equalTo("trainer"))
		.log().all();*/
	}
	
	@Test(priority=3, dependsOnMethods = {"CreateUser"})
	public void Updateuser() {
		
		HashMap  map = new HashMap();
		map.put("name", "pavan");
		map.put("job", "Teacher");
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.put("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(200)
		.body("name", equalTo("pavan"))
		.body("job", equalTo("Teacher"))
		.log().all();
	}
	
	@Test(priority = 4, dependsOnMethods = {"Updateuser"})
	public void DeleteUser() {
		
		
		given()
		
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(204)
		.log().all();
	}
}
