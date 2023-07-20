package day5;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;


public class ParsingXMLResponse {

	//Approach=1
	
	@Test(priority=1)
	public void testXMLResponse() {
		
		given()
		
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1")
		
		.then()
		.statusCode(200)
		.body("TravelerinformationResponse.page",equalTo("1"))
		.body("TravelerinformationResponse.travelers.Travelerinformation[0].name",equalTo("Developer"));
	}
	
	//Approach 2
	
	@Test(priority=2)
	public void testXMLResponseApproach2() {
		
		Response res = given()
		
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
		String page = res.xmlPath().get("TravelerinformationResponse.page");
		Assert.assertEquals(page,"1");
		
	}
	
	
	//Approach 3
	
	@Test(priority=3)
	public void testXMLResponseBody() {
		
		boolean status = false;
		Response res = given()
		
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		
		XmlPath obj = new XmlPath(res.asString());
		
		List<String> totalTravelers = obj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		
		int number = totalTravelers.size();
		Assert.assertEquals(number, 10);
		
		List<String> totalTravelersname = obj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		for(String s:totalTravelersname) {
			
			System.out.println(s);
			if(obj.get(s).equals("Ashor")) {
				status=true;
				break;
			}
		}
		Assert.assertEquals(status, true);
	}
}
