package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		 driver = new ChromeDriver();
		driver.get("https://cogmento.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@class='dropdown icon']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[text()='Indonesia (+62)']")).click();
		WebElement a = driver.findElement(By.xpath("//div[text()='India (+91)']"));
		System.out.println(a.getText());
		
		
	}

}
