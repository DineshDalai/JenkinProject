package day8;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class CreateUser {

	@Test(priority=1)
	public void testCreateUser(ITestContext context) {
		
		
		Faker faker = new Faker();
		JSONObject obj = new JSONObject();
		
		obj.put("name", faker.name().fullName());
		obj.put("gender", "Male");
		obj.put("email", faker.internet().emailAddress());
		obj.put("status", "Inactive");
		
		String barerToken = "4be106b22df04f9428c3fb63b2e098a862307fde089dd73df4ba178b46145cc4";
		
		int id = given()
		.headers("Authorization", "Bearer "+barerToken)
		.contentType("application/json")
		.body(obj.toString())
		
		.when()
		.post("https://gorest.co.in/public/v2/users")
		
		
		.jsonPath().getInt("id");
		
		System.out.println("Generate id is "+ id);
		
		context.setAttribute("user_id", id);
	}
}
