package myclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {

	public static void main(String[] args) {


WebDriver driver;
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//select Single check box
		//driver.findElement(By.id("thursday")).click();

		//select all check box
		
		/*
		 * List<WebElement> Allcheckbox = driver.findElements(By.
		 * xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 * 
		 * System.out.println("Total check box is "+Allcheckbox.size());
		 * 
		 * for(int i=0;i<Allcheckbox.size();i++) { Allcheckbox.get(i).click(); }
		 */
		 
		
		//Select multiple check box (method 1)
		/*
		 * List<WebElement> Allcheckbox = driver.findElements(By.
		 * xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 * 
		 * System.out.println("Total check box is "+Allcheckbox.size());
		 * 
		 * for(int i=0;i<Allcheckbox.size();i++) { if(i<2) { Allcheckbox.get(i).click();
		 * } }
		 */
		
		//Select multiple check box (method 2)
		 List<WebElement>  Allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 
		 for(WebElement e:Allcheckbox) {
			 String element = e.getAttribute("id");
if(element.equals("sunday")|| element.equals("monday") ) {
	e.click();
}
		 }
	}

}
