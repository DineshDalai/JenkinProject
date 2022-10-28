package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropdown = driver.findElement(By.id("input-country"));
		Select sel = new Select(dropdown);
             // sel.selectByIndex(1);		

		//sel.selectByIndex(3);
		sel.selectByVisibleText("Australia");
		
		List<WebElement> allelement = sel.getOptions();
		
		for(WebElement i:allelement){
			
			String s= i.getText();
			
			if(s.equalsIgnoreCase("India")) {
				i.click();
				System.out.println("India selected");
				break;
			}
		}
		//System.out.println(dropdown.getText());
	}

}
