package myclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionpopupNotification {

	public static void main(String[] args) {
		
WebDriver driver;
		
ChromeOptions option = new ChromeOptions();
option.addArguments("--disable notifications--");

		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com/");

	}

}
