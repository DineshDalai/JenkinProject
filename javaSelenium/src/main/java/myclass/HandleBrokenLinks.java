package myclass;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		int brokenlink =0;
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			String attribute = links.get(i).getAttribute("href");
			
			if(attribute == null || attribute.isEmpty()) {
				System.out.println("url is empty");
				continue;
			}
			
			URL url =new URL(attribute);
			try {
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			
			if(connection.getResponseCode()>=400) {
				System.out.println(connection.getResponseCode()+" "+attribute+" is broken link");
				brokenlink++;
			}else {
				System.out.println(connection.getResponseCode()+" "+attribute+" is not a broken link");
			}
			
		}
  catch(Exception e) {
	  
  }
		
	}
		System.out.println("Total borken links are "+brokenlink);
	}}
