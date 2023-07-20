package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) {
		
		
    WebDriver driver;

		
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("target")).sendKeys(Keys.ARROW_UP);

		driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
	}

}
