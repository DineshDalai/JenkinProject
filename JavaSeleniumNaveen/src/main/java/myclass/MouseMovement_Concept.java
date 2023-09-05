package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement_Concept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		//  ChromeOptions option1 = new ChromeOptions();
		//  option1.addArguments("--disable notifications--");
		 
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.navigate().refresh();
		Actions act = new Actions(driver);
		WebElement spiceclub = driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[text()='SpiceClub']"));
		act.moveToElement(spiceclub).build().perform();
		
	Thread.sleep(3000);
		WebElement Tierselement = driver.findElement(By.xpath("//div[text()='Tiers']"));
		Tierselement.click();
		

	}

}
