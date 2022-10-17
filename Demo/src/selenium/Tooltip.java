package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		

	}

}
