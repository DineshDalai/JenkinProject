package com.commonMethods;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.drivers.DriverFactory;



public  class CommonMethods  {
 
	
	public WebDriver driver; 
	public static  Logger logger;
	Actions action=new Actions(driver);
	
	public CommonMethods(WebDriver driver) {
		this.driver=driver;
	}

	
	//Element Visibility
	public static void ElementVisibility(WebDriver driver,WebElement locators,String message) {
		locators.isDisplayed();
		logger.info(message);
		
	}
	
	//Select method
	public static void SelectMethod(WebDriver driver,WebElement locators,String message) {
		locators.isSelected();
		logger.info(message);
	}
	
	//Enable Method
	public static void EnableMethod(WebDriver driver,WebElement locators,String message) {
		locators.isEnabled();
		logger.info(message);
	}
	
	//ClickOnElement
	public void click(WebDriver driver,WebElement elementName,String message) {
		try {
			validateElementVisibility(driver, elementName,message);
			
			elementName.click();
			logger.info(message);
		}
		catch(Exception e) {
			
		}
	}
	
	public void validateElementVisibility(WebDriver driver,WebElement elementName,String message) throws InterruptedException {
		WebElement element = driver.findElement((By) elementName);
				driver.wait(5000);
				if(element.isDisplayed()) {
					highlightElement(driver, element);
					logger.info(message);
				}else {
					logger.info("not"+message);
				}
	}
	
	
	//EnterText
	public void EnterText(WebDriver driver,WebElement elementName, String value,String message) {
		if(elementName.isDisplayed()) {
			elementName.clear();
			elementName.sendKeys(value);
			logger.info(message);
		}else {
			logger.info("not"+message);
		}
	}
	

	
	//validate text Message
	public static void ValidateText(WebDriver driver,WebElement locators,String value,int timeout,String message) {
		
		if(locators.getText().equalsIgnoreCase(value)) {
			System.out.println("Text value is equal");
			logger.info(message);
		}else {
			System.out.println("Text value is Not Equal");
			logger.info("not"+message);
		}
	}
	
	
	//Switch To Frame By Index
	public static void SwitchToFrame_UsingIndex(WebDriver driver,int frameindex,String message) {
		
		driver.switchTo().frame(frameindex);
		logger.info(message);
	}
	
	//Switch To Frame By Name
	public static void SwitchToframe_usingName(WebDriver driver,String frameName,String message) {
		
		driver.switchTo().frame(frameName);
		logger.info(message);
	}
	
	//Switch To Frame By WebElement
		public static void SwitchToframe_usingWebElement(WebDriver driver,String frameWebElement,String message) {
			
			driver.switchTo().frame(frameWebElement);
			logger.info(message);
		}
		
		//Alert Accept
		public static void AlertAccept(WebDriver driver,String message) {
			driver.switchTo().alert().accept();
			logger.info(message);
		}
		
		//Alert Dismiss
		public static void AlertDismiss(WebDriver driver,String message) {
			driver.switchTo().alert().dismiss();
			logger.info(message);
		}
		
		//Alert sendKeys
		public static void AlertSendkeys(WebDriver driver,String value,String message) {
			driver.switchTo().alert().sendKeys(value);
			logger.info(message);
		}
		
		
		//Single window handle
		public static void SingleWindowhandle(WebDriver driver,String windowName,String message) {
			
			windowName = driver.getWindowHandle();
			driver.switchTo().window(windowName);
			logger.info(message);
		}
		
		//Multiple window handle
				public static void MultipleWindowhandle(WebDriver driver,String childwindow,String message) {
					
				Set<String>	windowName = driver.getWindowHandles();
					
				Iterator it = windowName.iterator();
			if(	it.hasNext()){
					it.next();
				 childwindow = 	(String) it.next();
					driver.switchTo().window(childwindow);
					logger.info(message);
				}
				
				}
				
				public void jsClick(WebDriver driver,WebElement elementName, String message) {
					
					try {
						
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("arguments[0].click();", elementName);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				
				public void tabsToBeClicked(WebDriver driver,int number) throws InterruptedException {
					for(int i=0;i< number;i++) {
						action.sendKeys(Keys.TAB).build().perform();
						Thread.sleep(5000);
					}
				}
					public void downArrowToBeClicked(WebDriver driver,int number) throws InterruptedException {
						for(int i=0;i< number;i++) {
							action.sendKeys(Keys.ARROW_DOWN).build().perform();
							Thread.sleep(5000);
						}
			}
					public void backSpaceToBeClicked(WebDriver driver,int number) throws InterruptedException {
						for(int i=0;i< number;i++) {
							action.sendKeys(Keys.BACK_SPACE).build().perform();
							Thread.sleep(5000);
						}
					}
					
					public void clearText(WebDriver driver,By elementName, String message) {
						WebElement element = driver.findElement(null);
						if(element.isDisplayed()) {
							element.clear();
							System.out.println("pass");
						}else {
							System.out.println("Fail");
						}
					}
					
					
					public void validateElementvisibility(WebDriver driver,WebElement elementName,String message) {
						if(elementName.isDisplayed()  || elementName.getText() != null) {
							highlightElement(driver,elementName);
							System.out.println("");
						}else {
							System.out.println("");
						}
					}
					
					public void validateElementNotBlank(WebDriver driver,WebElement elementName,String message) {
						if(elementName.isDisplayed()  || elementName.getText() == null) {
							highlightElement(driver,elementName);
							System.out.println("");
						}else {
							System.out.println("");
						}
					}
					
					public void scrollDown(WebDriver driver) {
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("window.scrollBy(0,1000)");
						
					}
					
					public void ActualExceptedList(WebDriver driver,List<String> exceptedValue, List<String> actualValue , String message) {
						System.out.println(actualValue + " - "+exceptedValue);
						try {
							if(actualValue.equals(exceptedValue)) {
								System.out.println("");
							}else {
								System.out.println("");
							}
						}
							catch(Exception e) {
								e.printStackTrace();
							}
						}
					
					public String currentdate(WebDriver driver) {
						SimpleDateFormat formatter = new SimpleDateFormat("m/d/yyyy");
						formatter.setTimeZone(TimeZone.getTimeZone("CST"));
						Date date = new Date();
						String currentDate = formatter.format(date);
						return currentDate;
					}
	
					
					public void closeAllOpenTabs(WebDriver driver) {
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

						List<WebElement> list = driver.findElements(By.xpath("xyz"));
						System.out.println("No. of exiting open tabs that are present: " + list.size());
						if (!list.isEmpty()) {
							for (WebElement element : list) {
								element.click();
								System.out.println("Tabs closing");
							}
						}
					}
						
						public void highlightElement(WebDriver driver,WebElement elementName) {
							for(int i =0 ; i < 1;i++) {
								JavascriptExecutor js= (JavascriptExecutor)driver;
								js.executeScript("arguments[0].setAttribute('style',arguments[1]);", elementName,"color: black; border: 3px soid black");
								
							}
						}
				
						public void validateActualExceptedcontains(WebDriver driver,String expectedValue, String actualValue,String message) {
							System.out.println(actualValue);
							System.out.println(expectedValue);
							
							try {
								if(actualValue.contains(expectedValue)) {
									
									
								}else {
									
								}
							}catch(Exception e) {
								
							}
						}
						
						
									
						
				
				
				
	//By Locators
	
				
				
				public void jsClick(WebDriver driver,By elementName, String message) {
					
						WebElement eleClick = driver.findElement(elementName);
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("arguments[0].click();", eleClick);
					}
	
		
		//Select method
		public static void SelectMethod_ByLocators(WebDriver driver,By locators,String message) {
			driver.findElement(locators).isSelected();
			logger.info(message);
		}
		
		
		//EnterText
		public void EnterText(WebDriver driver,By elementName, String value,String message) {
			if(driver.findElement(elementName).isDisplayed()) {
				driver.findElement(elementName).clear();
				driver.findElement(elementName).sendKeys(value);
				logger.info(message);
			}else {
				logger.info("not"+message);
			}
		}
		
		
		//Enable Method
		public static void EnableMethod_ByLocators(WebDriver driver,By locators,String message) {
			driver.findElement(locators).isEnabled();
			logger.info(message);
		}
		
		//ClickOnElement
		public static void ClickOn_ByLocators(WebDriver driver,By locators,String message) {
			
			driver.findElement(locators).click();
			logger.info(message);
		}
		
		//EnterText
		public static void SendKey_ByLocators(WebDriver driver,By locators,String value,String message) {
			
			driver.findElement(locators).sendKeys(value);
			logger.info(message);
		}
		
		//validate text Message
		public static void ValidateTextusing_ByLocators(WebDriver driver,By locators,String value,int timeout,String message) {
			
			if(driver.findElement(locators).getText().equalsIgnoreCase(value)) {
				System.out.println("Text value is equal");
				logger.info(message);
			}else {
				System.out.println("Text value is Not Equal");
				logger.info("not"+message);
			}
		}	
	
	//Set implicity wait
	public static void ImplicityWait(WebDriver driver,int timeout,String message) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		logger.info(message);
	}
	
	
	//Set PageLoad Wait
	public static void PageLoadTimeOut(WebDriver driver,int timeout,String message) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeout));
		logger.info(message);
	}
	
	//Set Pause Time
	public static void PausePage(WebDriver driver,int time,String message) {
		
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info(message);
	}
	
	
	
	//Take Screenshot
	public void TakeScreenShotONPage(WebDriver driver,String Screenshotpagename,String message) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	File src =	ts.getScreenshotAs(OutputType.FILE);
	File trg = new File(".\\Screenshot\\"+"Screenshotpagename"+".png");
      FileUtils.copyFile(src, trg);
		logger.info(message);
	}
	
	//Navigate Back
	public void NavigateBack(WebDriver driver,String message) {
		driver.navigate().back();
		logger.info(message);
	}

	
	//navigate Forword	
	public void NavigateForword(WebDriver driver,String message) {
		driver.navigate().forward();
		logger.info(message);
	}
	
	public void validateElementVisibility_UsingBy_Locators(WebDriver driver,By elementName,String message) throws InterruptedException {
		WebElement element = driver.findElement((By) elementName);
				driver.wait(5000);
				if(element.isDisplayed()) {
					highlightElement(driver,element);
					logger.info(message);
				}else {
					logger.info("not"+message);
				}
	}
	
}
