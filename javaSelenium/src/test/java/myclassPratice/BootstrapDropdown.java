package myclassPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		  
		  List<WebElement> list =
		  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		  
		  for(WebElement e: list) { if(e.getText().equalsIgnoreCase("Invest")) {
		  e.click(); break; } }
		 
		
		Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		for(WebElement e: list1) {
			if(e.getText().equalsIgnoreCase("Demat Account")) {
				e.click();
				break;
			}
		}

	}

}
