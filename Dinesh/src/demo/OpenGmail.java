package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
 driver = new ChromeDriver();
 
 Thread.sleep(5000);
driver.get("https://www.gmail.com");
driver.findElement(By.xpath("gmaillinkxpath")).click();
driver.findElement(By.xpath("xpathof user name")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("xpath of pswd")).sendKeys("xyz");
driver.findElement(By.xpath("xpath of login")).click();

	}

}
