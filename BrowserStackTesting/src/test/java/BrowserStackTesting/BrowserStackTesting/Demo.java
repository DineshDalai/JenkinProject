package BrowserStackTesting.BrowserStackTesting;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static WebDriver driver;

	public static final String BROWSERSTACK_USERNAME = "dineshdalai_m4JS3P";
	public static final String BROWSERSTACK_ACCESS_KEY = "z71SjAJJDbtu7znHPXHY";
	public static String URL = "https://" + BROWSERSTACK_USERNAME + ":" + BROWSERSTACK_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

		// MutableCapabilities cap = new UiAutomator2Options();

		
		  
		/*
		 * DesiredCapabilities cap = new DesiredCapabilities(); cap.setCapability("os",
		 * "Windows"); cap.setCapability("osVersion", "11");
		 * cap.setCapability("browserName", "Chrome");
		 * cap.setCapability("browserVersion", "120.0");
		 * 
		 * WebDriver driver = new RemoteWebDriver(new URL(URL),cap);
		 */
		  
		 

		/*
		 * FirefoxOptions browserOptions = new FirefoxOptions();
		 * browserOptions.setPlatformName("Windows 10");
		 * browserOptions.setBrowserVersion("92"); Map<String, Object> cloudOptions =
		 * new HashMap<>(); cloudOptions.put("build", "myTestBuild");
		 * cloudOptions.put("name", "myTestName");
		 * browserOptions.setCapability("cloud:options", cloudOptions); WebDriver driver
		 * = new RemoteWebDriver(new URL(URL), browserOptions);
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * System.out.println("pass"); driver.close();
		 */

		DesiredCapabilities dc = new DesiredCapabilities();

    	
    	dc.setCapability("appium:deviceName", "Samsung Galaxy S23 Ultra");
    	//find from your mobile device, by going to the setting option and then to the “about Phone” option
    	//dc.setCapability("browserName", "safari");
    	dc.setCapability("appium:app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
    	//dc.setBrowserName("Chrome");
    	//dc.setCapability("appPackage", "com.samsung.android.dialer");
    	//to get this, go to the playstore, check for apk info app and install it, use it to find the app package for the application under test.
    	//dc.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
    	//using the same app apk info, you can find the appActivity too

    	//URL url = new URL("http://127.0.0.1:4723/wd/hub");
    	
    	 driver = new RemoteWebDriver(new URL(URL), dc);
    	//driver.get("https://www.google.com/");
    	//here the “http://127.0.0.1:” is your IP on the system, and port “4723” that you can see from the appium server
System.out.println("pass");
    	//AndroidDriver driver = new AndroidDriver(url, dc);
 //driver = new AndroidDriver(url, dc);
    	System.out.println("driver pass");
		System.out.println("pass");
		driver.close();
	}

}
