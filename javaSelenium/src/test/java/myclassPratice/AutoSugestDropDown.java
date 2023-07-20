package myclassPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugestDropDown {

	public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		Thread.sleep(3000);
		for(WebElement e:list) {
			if(e.getText().equalsIgnoreCase("Selenium Webdriver")) {
				
				e.click();
				break;
			}
		}
		driver.close();
	}

}
