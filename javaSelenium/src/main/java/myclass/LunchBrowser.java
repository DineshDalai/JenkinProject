package myclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
	// driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 driver.get("https://www.nopcommerce.com/en");
	System.out.println("Title of the page is "+ driver.getTitle());
	System.out.println("Url of the page is "+ driver.getCurrentUrl());
	System.out.println("The pagesource is "+ driver.getPageSource());
	 driver.close();
	}

}
