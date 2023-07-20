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

	//@Test
	public void xmlresponseBody() {
		
		
		
		//Approach 2
		
		Response res =
		given()
		
		.when()
		.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.statusCode(), 200);
				Assert.assertEquals(res.header("content-Type"), "application/xml; charset=utf-8");
				
				String travelerpage = res.xmlPath().get("TravelerinformationResponse.page").toString();
				
				Assert.assertEquals(travelerpage, "1");
				
String travelername = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name").toString();
				
				Assert.assertEquals(travelername, "Developer");
				
	}	
				
				@Test
				public void xmlresponse() {
				
					
					//Approach 2
					
					Response res =
					given()
					
					.when()
					.get("http://restapi.adequateshop.com/api/Traveler?page=1");
					
					XmlPath xmlobject =new XmlPath(res.asString());
							
					//verify total number of travelers
			List<String> travelers = xmlobject.getList(("TravelerinformationResponse.travelers.Travelerinformation"));
							
							Assert.assertEquals(travelers.size(), 10);
							
							//verify total number of travelers
					List<String> travelersname = xmlobject.getList(("TravelerinformationResponse.travelers.Travelerinformation.name"));
									
					boolean status= false;
									for(String travelername:travelersname) {
										System.out.println(travelername);
										if(travelername.equalsIgnoreCase("vano")) {
											status =true;
											break;
										}
									}
				Assert.assertEquals(status, true);
	}
}
