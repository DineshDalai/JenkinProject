package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.UserPOJO;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {

	@Test(priority=1,dataProvider = "Data",dataProviderClass =DataProviders.class )
	public void testPostusers(String userID,String userName,String fname,String lname,String useremail,String pwd,String ph) {
		
		UserPOJO pojoObject = new UserPOJO();
		pojoObject.setId(Integer.parseInt(userID));
		pojoObject.setUsername(userName);
		pojoObject.setFirstname(fname);
		pojoObject.setLastname(lname);
		pojoObject.setEmail(useremail);
		pojoObject.setPassword(pwd);
		pojoObject.setPhone(ph); 
		
		Response res = UserEndPoints.createUser(pojoObject);
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	
	@Test(priority=2, dataProvider = "UserNames",dataProviderClass =DataProviders.class)
	public void testDeleteUserByName(String userName) {
		Response res = UserEndPoints.DeleteUSer(userName);
		Assert.assertEquals(res.getStatusCode(), 200);
	}
}
