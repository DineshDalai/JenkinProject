package abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		
WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//CssSelector Tag and ID
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc");
		
		
		//Tag and Class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("dfg");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("dfg");
		

		//Tag and Attribute
		//driver.findElement(By.cssSelector("input[id]")).sendKeys("abc");
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("abc");
		//driver.findElement(By.cssSelector("[id=email]")).sendKeys("abc");
		
		
		//Tag Class and Attribute
		driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("abc");
		
		
		//Xpath
		//id=firstname
		//input[@id="firstname"]
		//input[contains(@id,first)]
		
		
		//input[@id='start']
		//input[@id='stop']
		//input[contains(@id,'st')]
		//input[starts-with(@id,'st')]
		
		//Chained xpath
		//form[@id='abc']//input[4]
		//input[@id='abc']//button[@class='xyz']
		
		
		//Or xpath
		//input[@id='abc' or @name='xyz']
		
		//And xpath
		//input[@id='abc' and @name='xyz']
		
		
		
	}

}
