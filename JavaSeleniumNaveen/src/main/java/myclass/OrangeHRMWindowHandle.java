package myclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindowHandle {

public static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,100)","");
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();

		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		
		List<String> WindowList = new ArrayList<String>(allwindow);
		
		for(String s: WindowList) {
			Thread.sleep(3000);
			String windowtitle =	driver.switchTo().window(s).getTitle();
			System.out.println(windowtitle);
			if(windowtitle.contains("LinkedIn")) {
				driver.switchTo().window(s);
				System.out.println("Found the rigrht window ...."+driver.getCurrentUrl());
				
		driver.switchTo().window(parentwindowid);
		System.out.println("Found the rigrht window ...."+driver.getCurrentUrl());
		System.out.println("Found the rigrht window ...."+driver.getTitle());
		
		for(String e: WindowList) {
			
		
		if(!e.equals(parentwindowid)) {
			driver.switchTo().window(e).close();
		}
	}
	}
		}}}
