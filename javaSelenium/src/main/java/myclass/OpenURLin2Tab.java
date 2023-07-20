package myclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURLin2Tab {

	public static void main(String[] args) {
		
WebDriver driver;

		
		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//Open new tab
		//driver.switchTo().newWindow(WindowType.TAB);
	driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");

	}

}
