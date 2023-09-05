package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("remote-allow-origins=*");
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
				WebElement target = driver.findElement(By.id("droppable"));
				
				Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();

	}

}
