 package myclass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonMiniumPrice {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();	
    driver = new ChromeDriver(option);
    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9or2l3trq5_e&adgrpid=116680128473&hvpone=&hvptwo=&hvadid=610780877882&hvpos=&hvnetw=g&hvrand=603422472092523682&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007799&hvtargid=kwd-317300364460&hydadcr=5622_2359475&gclid=Cj0KCQiAofieBhDXARIsAHTTldoufzVUWjKJnaefbQ9_F7lnF_nlAc2-GEz6ZSJ5KtCnyWOTGG1sEUsaAp32EALw_wcB");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme phone");
    Thread.sleep(3000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    
    List<WebElement>  Allprice = driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));
    
    double minvalue = 1000000000.0;
    double maxvalue = 0.0;
 
    for(int i=0;i<Allprice.size();i++) {
    	
    	String str = Allprice.get(i).getText();
    	
    	String s2 = str.toString().replace(',', '.');
    	
    	double d = Double.parseDouble(s2);
  
    	System.out.println("Real me price "+d);
    	if(minvalue>=d) {
    		minvalue=d;
    		
    	}else if(maxvalue<=d){
    		maxvalue=d;
    	}
    }
    System.out.println("minimum Realme price is "+minvalue);
    System.out.println("maximum Realme price is "+maxvalue);
	}
}
