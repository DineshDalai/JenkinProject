package day7;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authentication {

	
	@Test(priority=1)
	public void testBasicAuthentication() {
		
		given()
		.auth().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
	
	
	@Test(priority=2)
	public void testDigestAuthentication() {
		
		given()
		.auth().digest("postman", "password")
		
		.when()
		.get("https://postman-echo.com/digest-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
		
	}
	
	
	@Test(priority=3)
	public void testPremptiveAuthentication() {
		
		given()
		.auth().preemptive().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true))
		.log().all();
	}
}