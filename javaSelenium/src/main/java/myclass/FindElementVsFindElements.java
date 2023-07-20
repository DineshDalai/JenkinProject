package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver;
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchfield= driver.findElement(By.id("small-searchterms")); 
		searchfield.sendKeys("Test");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		
		
		for(WebElement i : allLinks) {
			
			System.out.println(i.getText());
		}
	}

}
