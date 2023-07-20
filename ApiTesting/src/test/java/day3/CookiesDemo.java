package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {

	@Test(priority=1)
	public void getCookie() {
		
		Response res = given()
		
		.when()
		.get("https://www.google.com/");
		
	//	String cookie = res.getCookie("AEC");
	//	System.out.println("Cookie is "+cookie);
		
		 Map<String,String> cookies = res.getCookies();
		 
		System.out.println("Cookie is "+cookies.keySet());
		
		for(String i : cookies.keySet() ) {
			System.out.println(i+" value is "+res.getCookie(i));
		}
		
		
	}
}
