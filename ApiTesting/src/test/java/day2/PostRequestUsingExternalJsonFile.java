package day2;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;


public class PostRequestUsingExternalJsonFile {

	@Test(priority=1)
	public void testjsonExternalFile() throws FileNotFoundException {
		
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
		.body("name", equalTo("Asish"))
		.body("Location", equalTo("Korea"))
		//.body("location", equalTo("France"))     //Location 'L' small letter only for POJO class 
		.body("phone",equalTo("369369"))
		.body("courses[0]",equalTo("paint"))
		.body("courses[1]",equalTo("Drawing"))
		.header("Content-Type", "application/json; charset=utf-8")
		
		.log().all();
	}





     //Delete the Request
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

