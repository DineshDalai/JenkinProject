package demo;


import org.testng.TestNG;
import org.testng.annotations.Test;
import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
public ChromeDriver driver;

	@Test
	public void BatchFile() throws InterruptedException {
        
	 driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
}
}