package day4;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;



public class ParsingJsonResponseData {

	
	//@Test(priority=1)
	public void testJsonResponseData() {
		
		//Approach-1
		/*
		 * given() .contentType("contentType.json")
		 * 
		 * .when() .get("http://localhost:3000/store")
		 * 
		 * 
		 * .then() .statusCode(200) .header("Content-Type",
		 * "application/json; charset=utf-8") .body("book[3].title",
		 * equalTo("The Lord of the Rings"));
		 */
		
		
		//Approach-2
		Response res =given()
				.contentType(ContentType.JSON)
		
		.when()
		
		.get("http://localhost:3000/store");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Content-Type"), "application/json; charset=utf-8");
		String bookname = res.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookname, "The Lord of the Rings");
	}
	
	@Test(priority=1)
	public void testJsonResponseBodyData() {
		Response res =given()
				.contentType(ContentType.JSON)
				//.contentType(ContentType.JSON)
				
				.when()
				
				.get("http://localhost:3000/store");
		JSONObject obj = new JSONObject(res.asString());
		
		for(int i=0;i<obj.getJSONArray("book").length();i++) {
			String book = obj.getJSONArray("book").getJSONObject(i).get("title").toString();
			System.out.println(book);
		}
		boolean status  = false;
		for(int i=0;i<obj.getJSONArray("book").length();i++) {
			String book = obj.getJSONArray("book").getJSONObject(i).get("title").toString();
			if(book.equalsIgnoreCase("The Lord of the Rings")) {
				status=true;
				break;
			}
		}
		Assert.assertEquals(status, true);
		
		double Totalprice =0.0;
		for(int i=0;i<obj.getJSONArray("book").length();i++) {
			String price = obj.getJSONArray("book").getJSONObject(i).get("price").toString();
			Totalprice = Totalprice+Double.parseDouble(price);
			
	}
		System.out.println(Totalprice);
}
}
