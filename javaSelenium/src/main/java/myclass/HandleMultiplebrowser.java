package myclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiplebrowser {

	public static void main(String[] args) throws InterruptedException {
		

WebDriver driver;
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
	Set<String> WindowIds =  driver.getWindowHandles();
	
	List<String>  windowidList = new ArrayList(WindowIds);
	String parentwindow = windowidList.get(0);
	String childwindow = windowidList.get(1);
	
	System.out.println("The parent window id is "+ parentwindow);
	System.out.println("The parent window id is "+ childwindow);
	
	
	/*
	 * WebDriver str = driver.switchTo().window(childwindow);
	 * 
	 * driver.findElement(By.id("myText")).sendKeys("dinesh@gmail.com");
	 * driver.switchTo().window(parentwindow);
	 * driver.findElement(By.name("username")).sendKeys("Admin123");
	 */
	
	//for(String winid:WindowIds) {
		for(String winid:windowidList) {
		String Title =driver.switchTo().window(winid).getTitle();
		System.out.println(Title);
		
		if(Title.equalsIgnoreCase("OrangeHRM")) {
			driver.close();
		}
	}
	}

}
