package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 driver.get("https://demo.nopcommerce.com/register");
	 
	WebElement searchfield= driver.findElement(By.id("small-searchterms"));
	
	if(searchfield.isDisplayed()) {
		System.out.println("Search filed displayed "+searchfield.isDisplayed());
	}
	 System.out.println("Search field is Enable "+searchfield.isEnabled());
	 
	 WebElement checkboxselect= driver.findElement(By.id("Newsletter"));
	
		if(checkboxselect.isSelected()) {
			System.out.println("checkbox filed selected");
		}else {
			System.out.println("checkbox filed not selected");
		}
	}

}
