package day8;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UpdateUser {

	@Test(priority=1)
	public void testUpdateUser(ITestContext context) {
		
		
		Faker faker = new Faker();
		
		JSONObject obj = new JSONObject();
		obj.put("name", faker.name().firstName());
		obj.put("gender", "Male");
		obj.put("email", faker.internet().emailAddress());
		obj.put("status", "Active");
		
		int id = (Integer) context.getAttribute("user_id");
		
		String barerToken = "4be106b22df04f9428c3fb63b2e098a862307fde089dd73df4ba178b46145cc4";
		
		given()
		.headers("Authorization", "Bearer "+barerToken)
		.contentType("application/json")
		.pathParam("id", id)
		.body(obj.toString())
		
		
		.when()
		.put("https://gorest.co.in/public/v2/users/{id}")
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
