package restApi;




import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Get_Request {

	@Test
	public void getWeatherDetails() {
		
		/*
		 * RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
		 * 
		 * RequestSpecification httpsrequest = RestAssured.given();
		 * 
		 * Response response=httpsrequest.request(Method.GET, "/Hyderabad");
		 * 
		 * String rensponseBody = response.getBody().asString();
		 * System.out.println("Response body is "+ rensponseBody);
		 */
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		String rensponseBody = response.getBody().asString();
		  System.out.println("Response body is "+ rensponseBody);
		  System.out.println(response.getStatusLine());
		  System.out.println(response.getHeader("content-type"));
		  
		  int statuscode = response.getStatusCode();
		  Assert.assertEquals(statuscode, 200);
		
		
	}
}
