package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDatePicker {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notifications--");
		
		
		ChromeOptions option1 = new ChromeOptions();
        option1.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option1);
		
		driver.get("https://www.easemytrip.com/flights.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ddate")).click();
		String month = "Jul";
		String year = "2023";
		String date = "1";
		
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//div[@class='month']")).getText();
			String monyr[] = monthyear.split(" ");
			
			
			String mn = monyr[0];//N
			String yr = monyr[1];
			
			
			
			if(mn.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
				break;
			}else {
				driver.findElement(By.id("img2Nex")).click();
			}
			
		}
		

		List<WebElement> alldate = driver.findElements(By.xpath("//li[@style='visibility:show']"));
		for(WebElement e:alldate) {
			if(e.getText().equalsIgnoreCase(date)) {
				System.out.println(e.getText());
				e.click();
				
				break;
			}
		}
	}

}
