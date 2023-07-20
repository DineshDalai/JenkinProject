package myclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) throws InterruptedException {

  WebDriver driver;
  ChromeOptions option = new ChromeOptions();
  option.addArguments("--remote-allow-origins=*");
  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		//driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Today's")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links present in the web Page is "+allLinks.size());
		
		//Method 1 to print all the links in console
		//for(WebElement e:allLinks) {
		//System.out.println(e.getText());
		
		
		//Method 2 to print all the links in console
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getAttribute("href"));
		}
	}

}
