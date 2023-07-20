package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) {


WebDriver driver;

		
		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//Rightclick 
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(tab);
		
		
		
		
		
		
		

	}

}
