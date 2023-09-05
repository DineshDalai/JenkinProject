package abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Death {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.birthdeath.odisha.gov.in/");
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//span[text()='Online Citizen Services']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c122-4']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='GANJAM']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c122-6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type to filter..']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='BERHAMPUR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Check Birth Registration Status']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c122-9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Death Registration']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c120-11']")).click();
		
		for(int i=193;i<1020;i++) {
			WebElement RegistrationNo = driver.findElement(By.xpath("//input[@formcontrolname='registrationNo']"));
					
			RegistrationNo.click();
			Thread.sleep(3000);
			//RegistrationNo.sendKeys("123/2010");
			System.out.println("clicked sucesfully");
			Thread.sleep(3000);
			String j =i+"/"+"2010";
			System.out.println(j.toString());
			RegistrationNo.sendKeys(j.toString());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Search']")).click();
			Thread.sleep(5000);
			WebElement subtitle = driver.findElement(By.xpath("//mat-card-subtitle[@class='mat-card-subtitle']"));
			String heading = subtitle.getText();
			if(heading.equalsIgnoreCase("No Records Found!")) {
				RegistrationNo.clear();
				continue;
			}
			
		WebElement Name = driver.findElement(By.xpath("//mat-cell[@data-label='Deceased Name']"));
		String s = Name.getText();
		System.out.println(s);
			if(s.equalsIgnoreCase("Udaya")) {
				break;
			}else if(s.equalsIgnoreCase("udayanath")) {
				break;
			}else if(s.equalsIgnoreCase("Udaya Barada")) {
				break;
			}else if(s.equalsIgnoreCase("uday Barada")) {
				break;
			}else if(s.equalsIgnoreCase("Udayabarada")) {
				break;
			}else if(s.equalsIgnoreCase("udayanath barada")) {
				break;
			}
			RegistrationNo.clear();
		}
	
	}
	}

