package basePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Pricing']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Features']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Customers']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Contact']")).isDisplayed();
		driver.findElement(By.name("username")).isDisplayed();
		driver.findElement(By.name("password")).isDisplayed();
		driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();

		driver.findElement(By.name("first_name")).isDisplayed();
		driver.findElement(By.name("surname")).isDisplayed();
		driver.findElement(By.name("email")).isDisplayed();
		driver.findElement(By.name("email_confirm")).isDisplayed();
		driver.findElement(By.name("username")).isDisplayed();
		driver.findElement(By.name("password")).isDisplayed();
		driver.findElement(By.name("passwordconfirm")).isDisplayed();
		
		driver.navigate().back();
		driver.findElement(By.name("username")).sendKeys("Dinesh1234");
		driver.findElement(By.name("password")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
	String username =	driver.findElement(By.xpath("//td[contains(text(),'Dinesh Dalai')]")).getText();
	System.out.println(username);
	Assert.assertEquals(username.trim(), "User: Dinesh Dalai");
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
