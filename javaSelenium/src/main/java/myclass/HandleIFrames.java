package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		
    WebDriverManager.chromedriver().setup();
    
    driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

     
   // driver.switchTo().frame("packageListFrame");
    driver.switchTo().frame(0);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();

    driver.switchTo().defaultContent();
    
    driver.switchTo().frame("packageFrame");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Alert']")).click();
	}

}
