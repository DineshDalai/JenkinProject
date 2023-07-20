package day8;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {

	
	@Test(priority=1)
	public void testDeleteUser(ITestContext context) {
		
		int id =(Integer) context.getAttribute("user_id");
		
		String barerToken = "4be106b22df04f9428c3fb63b2e098a862307fde089dd73df4ba178b46145cc4";
		
		given()
		.headers("Authorization"," Bearer "+barerToken)
		.pathParam("id", id)
		
		.when()
		.delete("https://gorest.co.in/public/v2/users/{id}")
		
		
		.then()
		.statusCode(204)
		.log().all();
	}
}
