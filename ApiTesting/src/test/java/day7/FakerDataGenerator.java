package day7;


import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {

	
	@Test(priority=1)
	public void testfakerDatagenerator() {
		
		
		Faker faker = new Faker();
		String fullname = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		
		String userName = faker.name().username();
		String password = faker.internet().password();
		
		String email= faker.internet().safeEmailAddress();
		
		System.out.println("Full Name is "+fullname);
		System.out.println("First Name is "+firstName);
		System.out.println("Last Name is "+lastName);
		System.out.println("User Name is "+userName);
		System.out.println("Password is "+password);
		System.out.println("Email Address is "+email);
		
		
		
	}
}
