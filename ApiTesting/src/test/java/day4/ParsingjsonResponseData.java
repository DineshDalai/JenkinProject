package day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ParsingjsonResponseData {

	//Approach 1
	@Test(priority=1)
     public void testJsonResponse() {
		
		
		given()
		
		.when()
		.contentType(ContentType.JSON)
		.get("http://localhost:3000/store")
		
		.then()
		.statusCode(200)
		.body("book[3].title",equalTo("The Lord of the Rings"));
    	 
     }
	
	@Test(priority=2)
	public void testjsonData() {
		
	Response res= given()
		
		.when()
		.contentType(ContentType.JSON)
		.get("http://localhost:3000/store");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		String bookname = res.jsonPath().getString("book[3].title").toString();
		
		Assert.assertEquals(bookname, "The Lord of the Rings");
		
	}
	
	
	
	@Test(priority=3)
	public void testjsonDataBody() {
		
		boolean status=false;
		double Totalbookprice =0;
		
		Response res=given()
		
		.when()
		.contentType(ContentType.JSON)
		.get("http://localhost:3000/store");
		
		JSONObject obj = new JSONObject(res.asString());
		
		for(int i=0;i<obj.getJSONArray("book").length();i++) {
			
			String bookname = obj.getJSONArray("book").getJSONObject(i).get("title").toString();
			System.out.println("book name is "+bookname);
			
			if (bookname.equalsIgnoreCase("The Lord of the Rings")) {
				status=true;
				break;
			}
		}
		Assert.assertEquals(status, true);
		
		
		for(int j=0;j<obj.getJSONArray("book").length();j++) {
			
			String bookprice = obj.getJSONArray("book").getJSONObject(j).get("price").toString();
			Totalbookprice = Totalbookprice + Double.parseDouble(bookprice);
		
		}
		System.out.println("Total book price is "+Totalbookprice);
		Assert.assertEquals(Totalbookprice,526.0);
	}

}