package abc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver  = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Self
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(),'TeamLease Service')]/self::a"));
		//System.out.println("xpath using selft "+element.getText());
		
		
		//parent
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(),'TeamLease Service')]/parent::td"));
		//System.out.println("xpath using parent "+element.getText());
		
		
		//child
	    //List<WebElement> element =	driver.findElements(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/child::td"));
        //System.out.println("xpath using child "+element.size());
		
		
		//Ancestor
	    //WebElement element = driver.findElement(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr"));
	    //System.out.println("xpath using ancestor "+element.getText());
		
		
		//Descendant
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/descendant::a"));
		//System.out.println("xpath using Descendant "+element.getText());
		
		
		
		//following
		//List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/following::tr"));
		//System.out.println("xpath using following "+element.size());
		
		
		//following Sibling
		//List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/following-sibling::tr"));
	    //System.out.println("xpath using following-sibling "+element.size());
	    
	    
	    //preceding
	    //List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/preceding::tr"));
	    //System.out.println("xpath using preceding "+element.size());
	  
	    
	  //preceding-sibling
	    List<WebElement> element = driver.findElements(By.xpath("//a[contains(text(),'TeamLease Service')]/ancestor::tr/preceding-sibling::tr"));
	    System.out.println("xpath using preceding-sibling "+element.size());
	    
	    
	}

}
