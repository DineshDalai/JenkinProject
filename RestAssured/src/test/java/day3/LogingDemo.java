package day3;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LogingDemo {

	
	@Test(priority=1)
			public void testLogs() {
				
				
				 given()
				
				.when()
				.get("https://reqres.in/api/users?page=2")
				
				
			.then()
			//.log().body();
			//.log().cookies();
			//.log().headers();
				 .log().all();
}
}