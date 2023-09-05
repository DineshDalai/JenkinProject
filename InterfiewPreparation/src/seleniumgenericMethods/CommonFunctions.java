package seleniumgenericMethods;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions {
	WebDriver driver;
	Actions action=new Actions(driver);
	
	public void closeAllOpenTabs() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> list = driver.findElements(By.xpath("xyz"));
		System.out.println("No. of exiting open tabs that are present: " + list.size());
		if (!list.isEmpty()) {
			for (WebElement element : list) {
				element.click();
				System.out.println("Tabs closing");
			}
		}
	}// Zgt5G4kj-kJ:NQi

	public void click(WebElement elementName,String message) {
		try {
			validateElementVisibility(elementName,message);
			
			elementName.click();
		}
		catch(Exception e) {
			
		}
	}
	
	public void enterText(WebElement elementName, String value,String message) {
		if(elementName.isDisplayed()) {
			elementName.clear();
			elementName.sendKeys(value);
		}else {
			
		}
	}
	
	public void validateActualExcepted(String expectedValue, String actualValue,String message) {
		System.out.println(actualValue);
		System.out.println(expectedValue);
		
		try {
			if(actualValue.equals(expectedValue)) {
				
			}else {
				
			}
		}catch(Exception e) {
			
		}
	}
	
	public void validateActualExceptedcontains(String expectedValue, String actualValue,String message) {
		System.out.println(actualValue);
		System.out.println(expectedValue);
		
		try {
			if(actualValue.contains(expectedValue)) {
				
			}else {
				
			}
		}catch(Exception e) {
			
		}
	}
	
	public void validateElementVisibility(WebElement elementName,String message) throws InterruptedException {
		WebElement element = driver.findElement((By) elementName);
				driver.wait(5000);
				if(element.isDisplayed()) {
					highlightElement(element);
					
				}else {
					
				}
	}
	public void validateElementInVisibility(By elementName,String message) {
		if(driver.findElements(elementName).size()>0) {
			
		}else {
			
		}
	}
	
	
	public void validateElementEnabled(WebElement elementName,String message) {
		if(elementName.isEnabled()) {
			
		}else {
			
		}
	}
	
	public void highlightElement(WebElement elementName) {
		for(int i =0 ; i < 1;i++) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style',arguments[1]);", elementName,"color: black; border: 3px soid black");
			
		}
	}
	
	public String getText(By elementName) {
		String text="";
		try {
			WebElement element = driver.findElement(elementName);
			if(element.isDisplayed()) {
				text = element.getText().toString().trim();
			}}
			catch(Exception e) {
				
			}
			return text;
		}
	
	public void validateElementDisabled(WebElement elementName,String message) {
		if(!elementName.isEnabled()) {
			
		}else {
			
		}
	}
	
	public void validateElementBlank(WebElement elementName,String message) {
		if(!elementName.getText().isEmpty()) {
			
		}else {
			
		}
	}
	
	protected void scrolluntilVisible(WebElement webElement) {
		try {
			WebElement element = webElement.findElement(By.xpath("./../.."));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			
		}catch(Exception e) {
			
		}
	}
	
	public void scrollUntilVisible(WebElement element, String pixels) {
		try {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false);window.scrollBy(0," + pixels + ");", element);
			
		}catch(Exception e) {
			
		}
	}
	
	public void validateDropdownvalues(String dropdownName, Select select,List<String> expectedFilterList) {
		
		try {
			List<String> actualFilterList = new ArrayList<String>();
			
			List<WebElement> elements = select.getOptions();
			int size = elements.size();
			for(int i =0; i< size; i++) {
				actualFilterList.add(elements.get(i).getAttribute("title"));
			}
			if(actualFilterList.containsAll(expectedFilterList)) {
				
			}else {
				
			}
		}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	public String getInnerText(By elementname , String message) {
		String txt = "";
		try {
			WebElement element = driver.findElement(elementname);
			if(element.isDisplayed()) {
				txt = element.getAttribute("innerText").toString().trim();
			}
		}catch(Exception e) {
			
		}
		return txt;
	}
	public void tableSortRecords(String tableID, String columnHeader , String orderType) {
		List<String> obtainedList = new ArrayList<String>();
		String actualColumnHeader = "";
		int index = 0;
		List<WebElement> tableColumnHeader = driver.findElements(By.xpath("//table[@id='"+ tableID + "']/thead/tr/th"));
			for(int i=1;i<= tableColumnHeader.size();i++) { 
		 actualColumnHeader = driver.findElement(By.xpath("//table[@id='"+ tableID+ "']/thead/tr/th[" + i +"]")).getText();
		 
		 if(actualColumnHeader.equalsIgnoreCase(columnHeader)) {
			 index =1;
			 break;
		 }
		
	}
			switch(orderType) {
			case"Ascending":
				jsClick(By.xpath("//table[@id='" + tableID + "']/thead/tr/th[" + index + "]"), "to sort");
				break;
				
			case"Descending":
				jsClick(By.xpath("//table[@id='" + tableID + "']/thead/tr/th[" + index + "]"), "to sort");
				jsClick(By.xpath("//table[@id='" + tableID + "']/thead/tr/th[" + index + "]"), "to sort");
				break;
			}
			
	List<WebElement> tableResults =driver.findElements(By.xpath("//table[@id='" + tableID + "']/tbody/tr/td[" + index + "]"));
	for(int i=1;i<tableResults.size();i++) {
		String columnValue = driver.findElement(By.xpath("//table[@id='" + tableID + "']/tbody/tr[" + i + "]/td[" + index + "]" )).getText();
		obtainedList.add(columnValue);
	}
	List<String> expectedList = obtainedList;
	if(orderType.equalsIgnoreCase("Ascending")) {
		Collections.sort(expectedList);
	}
	else {
		Collections.sort(expectedList);
		Collections.reverse(expectedList);
	}
	if(expectedList == obtainedList) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	}
	
	public void jsClick(By elementName, String message) {
		try {
			WebElement eleClick = driver.findElement(elementName);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", eleClick);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
			
	public void jsClick(WebElement elementName, String message) {
		
		try {
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", elementName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void tabsToBeClicked(int number) throws InterruptedException {
		for(int i=0;i< number;i++) {
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(5000);
		}
	}
		public void downArrowToBeClicked(int number) throws InterruptedException {
			for(int i=0;i< number;i++) {
				action.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(5000);
			}
}
		public void backSpaceToBeClicked(int number) throws InterruptedException {
			for(int i=0;i< number;i++) {
				action.sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(5000);
			}
		}
		
		public void clearText(By elementName, String message) {
			WebElement element = driver.findElement(null);
			if(element.isDisplayed()) {
				element.clear();
				System.out.println("pass");
			}else {
				System.out.println("Fail");
			}
		}
		
		
		public void validateElementvisibility(WebElement elementName,String message) {
			if(elementName.isDisplayed()  || elementName.getText() != null) {
				highlightElement(elementName);
				System.out.println("");
			}else {
				System.out.println("");
			}
		}
		
		public void validateElementNotBlank(WebElement elementName,String message) {
			if(elementName.isDisplayed()  || elementName.getText() == null) {
				highlightElement(elementName);
				System.out.println("");
			}else {
				System.out.println("");
			}
		}
		
		public void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			
		}
		
		public void ActualExceptedList(List<String> exceptedValue, List<String> actualValue , String message) {
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
		
		public String currentdate() {
			SimpleDateFormat formatter = new SimpleDateFormat("m/d/yyyy");
			formatter.setTimeZone(TimeZone.getTimeZone("CST"));
			Date date = new Date();
			String currentDate = formatter.format(date);
			return currentDate;
		}
		public static void main(String[] args) {
		
	}
}
