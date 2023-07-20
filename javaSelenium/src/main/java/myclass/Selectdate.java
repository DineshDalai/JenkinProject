package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdate {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver;

		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("dob")).click();
		
		Select sel = new Select(driver.findElement(By.className("ui-datepicker-month")));
		
		sel.selectByVisibleText("Feb");

      Select sele = new Select(driver.findElement(By.className("ui-datepicker-year")));
		
      sele.selectByValue("1998");
      //sele.selectByVisibleText("1998");
		//sele.selectByIndex(44);
   
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//a[@href='#']"));
		
		for(WebElement e:alldates) {
			if(e.getText().equals("15")) {
				e.click();
				break;
			}
		}
	}

}
