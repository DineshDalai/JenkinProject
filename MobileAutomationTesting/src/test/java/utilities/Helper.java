package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Scenario;

public class Helper {

	private static Helper Helper;    
    private static WebDriver driver;
    public final static int TIMEOUT = 2;
    public Properties configProp;
   // Actions action=new Actions(driver);
    
    private Helper() throws IOException {
        
    	UiAutomator2Options dc = new UiAutomator2Options();

    	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "dinesh's F23");
    	//find from your mobile device, by going to the setting option and then to the “about Phone” option
    	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
    	dc.setCapability("appPackage", "com.samsung.android.dialer");
    	//to get this, go to the playstore, check for apk info app and install it, use it to find the app package for the application under test.
    	dc.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
    	//using the same app apk info, you can find the appActivity too

    	URL url = new URL("http://127.0.0.1:4723/wd/hub");
    	//here the “http://127.0.0.1:” is your IP on the system, and port “4723” that you can see from the appium server
System.out.println("pass");
    	//AndroidDriver driver = new AndroidDriver(url, dc);
 driver = new AndroidDriver(url, dc);
    	System.out.println("driver pass");
    	
     }
    

    
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() throws IOException {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() throws InterruptedException {
         if(driver!=null) {
        	 Thread.sleep(5000);
            // driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
     public static String GetUserName() {
      return "Facebook Username";
     }
     
     public static String GetPassword() {
      return "Facebook password";
     }
     
     public static void SendKeys(By by,String fname) {
    	 ClearMethod(by);
    	 driver.findElement(by).sendKeys(fname);
     }
     
     public static void ClearMethod(By by) {
    	 driver.findElement(by).clear();
     }
	
   //EnterText
 	public static void EnterText(By elementName, String value) {
 		WebElement element = driver.findElement(elementName);
 		if(element.isDisplayed()) {
 			
 			element.clear();
 			element.sendKeys(value);
 			//logger.info(message);
 		}else {
 			//logger.info("not"+message);
 		}
 	}
 	
 	
 	public static void clearText(By elementName) {
		WebElement element = driver.findElement(elementName);
		if(element.isDisplayed()) {
			element.clear();
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
	}
 	
 	//ClickOnElement
 			public static void ClickOn_ByLocators(By locators) {
 				
 				driver.findElement(locators).click();
 				
 			}
 			
 			public static void highlightElement(By elementName) {
				for(int i =0 ; i < 1;i++) {
					JavascriptExecutor js= (JavascriptExecutor)driver;
					js.executeScript("arguments[0].setAttribute('style',arguments[1]);", elementName,"color: black; border: 3px soid black");
					
				}
			}
 	
 			public static void validateElementVisibility(By elementName) throws InterruptedException {
 				WebElement element = driver.findElement((By) elementName);
 						driver.wait(5000);
 						if((element).isDisplayed()) {
 							highlightElement(elementName);
 							
 						}else {
 							
 						}
 			}
 			
 			//ClickOnElement
 			public static void click(By elementName,String message) {
 				WebElement element = driver.findElement((By) elementName);
 				try {
 					validateElementVisibility(elementName);
 					
 					element.click();
 					
 				}
 				catch(Exception e) {
 					
 				}
 			}
 			
 			public static void  ScreenShot(String screenTitle) throws IOException {
 				
 		        TakesScreenshot scrShot =((TakesScreenshot)Helper.getDriver());

 		                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    

 		                File DestFile=new File("D:\\NopEcommerceScreenShot\\"+screenTitle+".jpg");

 		                FileUtils.copyFile(SrcFile, DestFile);

 			}
 			
 			public enum ScrollDirection {
 		        UP, DOWN, LEFT, RIGHT
 		    }
 			
 		public static void scroll(ScrollDirection dir, double scrollRatio){
 		
 		        Duration SCROLL_DUR = Duration.ofMillis(300);
 		        if (scrollRatio < 0 || scrollRatio > 1) {
 		            throw new Error("Scroll distance must be between 0 and 1");
 		        }
 		        Dimension size = Helper.driver.manage().window().getSize();
 		        System.out.println(size);
 		        Point midPoint = new Point((int)(size.width * 0.5),(int)(size.height * 0.5));
 		        int bottom = midPoint.y + (int)(midPoint.y * scrollRatio);
 		        int top = midPoint.y - (int)(midPoint.y * scrollRatio);
 		        //Point Start = new Point(midPoint.x, bottom );
 		        //Point End = new Point(midPoint.x, top );
 		        int left = midPoint.x - (int)(midPoint.x * scrollRatio);
 		        int right = midPoint.x + (int)(midPoint.x * scrollRatio);

 		        if (dir == ScrollDirection.UP) {
 		            swipe(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
 		        } else if (dir == ScrollDirection.DOWN) {
 		            swipe(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
 		        } else if (dir == ScrollDirection.LEFT) {
 		            swipe(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
 		        } else {
 		            swipe(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
 		        }



 		        //Point Start = new Point(Right, midPoint.y );
 		        //Point End = new Point(Left, midPoint.y );

 		        //swipe(Start, End, );
 		    }

 			
 			 public static void swipe(Point start, Point end, Duration duration) {

 		        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
 		        Sequence swipe = new Sequence(input, 0);
 		        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
 		        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
 		        /*if (isAndroid) {
 		            duration = duration.dividedBy(ANDROID_SCROLL_DIVISOR);
 		        } else {
 		            swipe.addAction(new Pause(input, duration));
 		            duration = Duration.ZERO;
 		        }*/
 		        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
 		        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
 		        ((AppiumDriver) Helper.driver).perform(ImmutableList.of(swipe));
 		    }
 			
 			 public void ScrollRight(By element) {
 			scroll(ScrollDirection.RIGHT, 0.5);
 			 }
}
