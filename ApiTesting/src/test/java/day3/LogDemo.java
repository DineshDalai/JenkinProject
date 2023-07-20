package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class LogDemo {

	
	@Test(priority=1)
	public void testLogs() {
		
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.log().all()
		.log().cookies()
		.log().headers()
		.log().body();
	}
}
