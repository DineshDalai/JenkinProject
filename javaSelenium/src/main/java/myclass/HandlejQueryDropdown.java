package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlejQueryDropdown {

	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
       driver.manage().window().maximize();
       driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
       
       WebElement element = driver.findElement(By.xpath("//button[@id='comboTree948546ArrowBtn']//span[@class='comboTreeArrowBtnImg']"));
       element.click();
       
     List<WebElement> listelement =  driver.findElements(By.xpath(""));
     
     
	}

}
