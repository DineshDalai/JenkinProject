package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PickCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		//it will close the popup like Allow And Block
         ChromeOptions option1=new ChromeOptions();
		
		option1.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option1);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement From = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]"));
		From.click();
		From.sendKeys("goa");
		
		WebElement To = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
		
		To.sendKeys("Amd");
		
		
	}

}
