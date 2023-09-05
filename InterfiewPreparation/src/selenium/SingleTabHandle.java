package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTabHandle {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("newTabBtn")).click();
		
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);
		
		Set<String> childTab = driver.getWindowHandles();
		
		for(String s:childTab) {
			
			if(!parentTab.equals(s)) {
				driver.switchTo().window(s);
			WebElement abc= driver.findElement(By.xpath("//div[contains(text(),' an alert box.')]"));
			System.out.println(abc.getText());
			
				driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parentTab);
		
		driver.close();
	}

}
