package day3;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {

	@Test(priority=1)
	public void testheaders() {
		
		given()
		
		.when()
		.get("https://www.google.com/")
		
		
		.then()
		.header("Server", "gws")
		.and()
		.log().all()
		.log().headers();
	}
	
	
	@Test(priority=2)
	public void getHeaders() {
		
		Response res = given() 
		
		.when()
		.get("https://www.google.com/");
		
		String s = res.getHeader("Server");
		System.out.println("header is "+s);
		
	Headers	Allheader = res.getHeaders();
		System.out.println("All headers "+res.getHeaders());
		
		for(Header h:res.getHeaders()) {
			
			System.out.println("The key is "+h.getName()+" the value is "+h.getValue() );
		}
	
	}
}
