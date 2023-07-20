package day3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


public class HeadersDemo {

	
	//@Test(priority=1)
		public void testHeaders() {
			
			
			 given()
			
			.when()
			.get("https://www.google.com/")
			
			
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1")
		.header("Content-Encoding", "gzip")
		.header("Server", "gws") ;
		}
	
	
	@Test(priority=1)
	public void getHeadersinfo() {
		
		
	Response res =	 given()
		
		.when()
		.get("https://www.google.com/");
	String contentvalue = res.getHeader("Content-Type");
		
		System.out.println("Content Type value is "+contentvalue);
		
		Headers headervalues = res.getHeaders();
		
		for(Header h : headervalues) {
	
			System.out.println(h.getName() +  "     "+h.getValue());
		}
	
	}
	
	
		
}
