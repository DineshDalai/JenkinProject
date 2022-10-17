package testngtutorial;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowser {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) {
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	if(browserName.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
	}else if(browserName.equalsIgnoreCase("ie")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		
		
	}else {
		System.out.println("Invalid browser");
	}
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	driver.getTitle();
	driver.quit();
}
}