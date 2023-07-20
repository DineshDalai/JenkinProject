package myclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
	// driver = new ChromeDriver();
		


		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
	 driver.get("https://www.nopcommerce.com/en");
	System.out.println("Title of the page is "+ driver.getTitle());
	System.out.println("Url of the page is "+ driver.getCurrentUrl());
	System.out.println("The pagesource is "+ driver.getPageSource());
	 driver.close();
	}

}
