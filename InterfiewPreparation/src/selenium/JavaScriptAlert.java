package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	alert.accept();	
	driver.close();
	}

}
