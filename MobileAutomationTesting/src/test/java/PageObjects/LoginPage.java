package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;

import stepDefinations.BaseClass;
import utilities.Helper;

public class LoginPage extends BaseClass{

	public Properties configProp;
	
	 public LoginPage (WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }
	  
	//LoginPage Locators
		private By Keypad_icon = By.id("com.samsung.android.dialer:id/tab_text_view");
		private By Search_icon = By.id("com.samsung.android.dialer:id/dialer_menu_search");
		private By Result_contact = By.id("com.samsung.android.dialer:id/contact_list_text_area");
		private By CallEnd_button = By.id("com.samsung.android.incallui:id/voice_disconnect_button");
	  
		
		public void clickKeyboard() {
			helper.ClickOn_ByLocators(Keypad_icon);
		}
		
		public void clickSearch() throws InterruptedException {
			Thread.sleep(2000);
			helper.ClickOn_ByLocators(Search_icon);
		}
		public void SearchContact(String string) {
			helper.EnterText(Search_icon, string);
		}
		
		public void SwipeContact() throws InterruptedException {
			Thread.sleep(2000);
			
			helper.ScrollRight(Result_contact);
		}
		
		public void callEndButton() throws InterruptedException {
			Thread.sleep(2000);
			helper.ClickOn_ByLocators(CallEnd_button);
		}
}
