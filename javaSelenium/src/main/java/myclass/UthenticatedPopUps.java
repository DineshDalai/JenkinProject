 package myclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UthenticatedPopUps {

	public static void main(String[] args) {



WebDriver driver;
		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
