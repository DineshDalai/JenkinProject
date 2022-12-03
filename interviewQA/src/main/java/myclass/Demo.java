package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Car & bike essentials')]"));
		String text = element.getText();
		System.out.println("The given text is "+text);
		
		String TotalPage =text.substring(text.indexOf("to")+2, text.indexOf("off")-2);
		int a = text.charAt(25);
		
		System.out.println("Showing with out percentage value = "+TotalPage);
		   
		   String TotalPag =text.substring(text.indexOf("to")+2, text.indexOf("off")-1);
		   System.out.println("Showing with percentage value = "+TotalPag);
		   
	}

}
