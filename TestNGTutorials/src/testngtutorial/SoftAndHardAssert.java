package testngtutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	@Test
	public void softassert() {
		
		SoftAssert softassert=new SoftAssert();
		System.out.println("soft assert start");
		softassert.assertEquals(12, 12,"number match");
		System.out.println("Ended");
		softassert.assertAll();
	}

	@Test
	public void hardassert() {
		
		
		System.out.println("hard assert start");
		Assert.assertEquals(22, 22);
		System.out.println("Ended hard assert");
	}
}
