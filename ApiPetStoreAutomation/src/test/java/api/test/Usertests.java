package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payload.UserPOJO;
import io.restassured.response.Response;

public class Usertests {

	
	Faker faker;
	UserPOJO pojoObject;
	
	@BeforeClass
	public void setUpData() {
		
	
	faker = new Faker();
	
	 pojoObject = new UserPOJO();
	
	pojoObject.setId(faker.idNumber().hashCode());
	pojoObject.setUsername(faker.name().username());
	pojoObject.setFirstname(faker.name().username());
	pojoObject.setLastname(faker.name().username());
	pojoObject.setEmail(faker.internet().safeEmailAddress());
	pojoObject.setPassword(faker.internet().password(5, 10));
	pojoObject.setPhone(faker.phoneNumber().cellPhone());
	
}
	@Test(priority=1)
	public void testPostuser() {
		
		Response res = UserEndPoints.createUser(pojoObject);
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	
	@Test(priority=2)
	public void getuserByName() {
		
		Response res = UserEndPoints.Readuser(this.pojoObject.getUsername());
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	
	@Test(priority=3)
	public void testUpdateByUserName() {
		
		
		//Update data using payload
		 pojoObject.setFirstname(faker.name().username());
		pojoObject.setLastname(faker.name().username());
		
		Response res = UserEndPoints.UpdateUser(this.pojoObject.getUsername(), pojoObject);
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
		
	}
	
	@Test(priority=4)
	public void testDeleteuser() {
		
		Response res = UserEndPoints.DeleteUSer(this.pojoObject.getUsername());
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
	}
}