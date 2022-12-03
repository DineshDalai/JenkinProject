package myclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {


		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		int count =0;
		List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='contactList']//tbody//tr"));
		System.out.println("Total Row is = "+AllRows.size());
		
		List<WebElement> AllColumns = driver.findElements(By.xpath("//table[@id='contactList']//tbody//tr//th"));
		System.out.println("Total Column is = "+AllColumns.size());
		
		for(int i=1;i<=5;i++) {
			WebElement element = driver.findElement(By.xpath("//table[@id='contactList']//tbody//tr[5]/td["+i+"]"));
			System.out.println("The Column value is = "+element.getText());
		}
		
		for(int i=2;i<=7;i++) {
			WebElement salaryColumn = driver.findElement(By.xpath("//table[@id='contactList']//tbody//tr["+i+"]//td[4]"));
			System.out.println("The Column value is = "+salaryColumn.getText());
		}
		
		for(int i=2;i<=7;i++) {
			WebElement salaryColumn = driver.findElement(By.xpath("//table[@id='contactList']//tbody//tr["+i+"]//td[4]"));
			String e =salaryColumn.getText();
			System.out.println("Money "+e);
			int a =Integer.parseInt(e);
			if(a >= 3000) {
			System.out.println("3000 above value is = "+a);
			count++;
			
		}
			System.out.println("Total count is = "+count);
	}

	}}
