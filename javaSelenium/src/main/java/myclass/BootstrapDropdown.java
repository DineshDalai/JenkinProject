package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) {


WebDriver driver;
		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");

		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		List<WebElement> alldropdownvalues = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		for(WebElement e:alldropdownvalues) {
			if(e.getText().equalsIgnoreCase("Accounts")) {
				e.click();
			}
		}
	}

}
