package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window is "+parentwindow);

		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> childwindow = driver.getWindowHandles();
		
		
		for(String s:childwindow) {
			if(!parentwindow.equals(s)) {
				System.out.println(s);
				driver.switchTo().window(s);
				driver.findElement(By.id("firstName")).sendKeys("abc");
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(2000);
			driver.switchTo().window(parentwindow);
			driver.findElement(By.id("name")).sendKeys("Dinesh");
			Thread.sleep(2000);
			driver.close();
			
		
	}

}
