package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		

WebDriver driver;

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();

		WebElement drag = driver.findElement(By.id("box2"));
		
		WebElement drop = driver.findElement(By.xpath("//div[text()='Spain']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}

}
