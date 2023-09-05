package myclass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		driver = new ChromeDriver();
		
		
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> windowname1 = driver.getWindowHandles();
		System.out.println("window id is "+windowname1);
		
		/*
		 * Iterator<String> it = windowname1.iterator(); String parentwindow =
		 * it.next(); System.out.println(parentwindow); String childwindow = it.next();
		 * driver.switchTo().window(childwindow); System.out.println(childwindow);
		 */
		Iterator it = windowname1.iterator();
		if(	it.hasNext()){
				it.next();
			String childwindow = 	(String) it.next();
				driver.switchTo().window(childwindow);
				
			}
		
		Thread.sleep(5000);
	String text= 	driver.findElement(By.id("sampleHeading")).getText();
	if(text.equalsIgnoreCase("This is a sample page")) {
		System.out.println("text pass");
		System.out.println(text);
	}
	else {
		System.out.println("text fail");
	}

}
}
