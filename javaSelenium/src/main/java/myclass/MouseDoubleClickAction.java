package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClickAction {

	public static void main(String[] args) {

WebDriver driver;

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement Doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		
		Actions act = new Actions(driver);
		act.doubleClick(Doubleclick).build().perform();
	}

}
