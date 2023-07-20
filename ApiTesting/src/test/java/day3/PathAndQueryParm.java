package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PathAndQueryParm {

	@Test
	public void test_pathQueryparm() {
		//https://reqres.in/api/users?page=2
		
		given()
		.pathParam("myparam", "users")
		.queryParam("page", 2)
		.queryParam("id", 5)
		
		.when()
		.get("https://reqres.in/api/{myparam}")
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
