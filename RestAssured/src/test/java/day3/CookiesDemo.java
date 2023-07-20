package day3;


import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


public class CookiesDemo {

	//@Test(priority=1)
	public void testCookies() {
		
		
		 given()
		
		.when()
		.get("https://www.google.com/")
		
		
	.then()
	.cookie("AEC", "AUEFqZfLahjZHCD76ptddU-jzOgid4KILOPXK45GxZ46EqkunN7TAxpp0A")
	.log().all();
		 
	}
	
	
	
	
	@Test(priority=2)
	public void getCookiesinfo() {
		
		
		Response res = given()
		
		.when()
		.get("https://www.google.com/");
		
		//get Single cookie
	String cooki_value=	res.getCookie("AEC");
	System.out.println("The cookie value is "+ cooki_value);
	
	
	//get multiple cookies
Map<String,String> allcookies=	res.getCookies();
System.out.println(allcookies.keySet());


     for(String k:allcookies.keySet()) {
    	 
    	 String value = res.getCookie(k);
    	 System.out.println(k+"        "+value);
     }
	}
}
