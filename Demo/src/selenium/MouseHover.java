package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		ChromeOptions option1=new ChromeOptions();
		
		option1.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option1);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		Thread.sleep(8000);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
		Thread.sleep(8000);
		if(driver.findElement(By.xpath("//div[text()='Senior Citizen Discount']")).isDisplayed()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	driver.findElement(By.xpath("//div[text()='Senior Citizen Discount']")).click();
		
		
		
		
	}

}
