package myclass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {


WebDriver driver;

ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		//driver.get("https://www.bing.com/?toWww=1&redig=F6B756F565FE408CA30E9004C2DC11EC");
		driver.get("https://www.google.co.in/");
	
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		//List<WebElement> dropdownvalues = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		List<WebElement> dropdownvalues = driver.findElements(By.xpath("//div[@class='pcTkSc']//span"));
		//li[@class='sbct']//div[@role='option']//div[1]/span
		System.out.println("Size of auto suggesion is "+ dropdownvalues.size());
	
		for(WebElement e:dropdownvalues) {
			System.out.println(e.getText());
			if(e.getText().equalsIgnoreCase("selenium webdriver")) {
				e.click();
				break;
			}
		}

	}

}
