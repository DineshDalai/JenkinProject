package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	//By Locators
	private By emailInputLocators = By.name("email");
	private By passwordInputLocators = By.name("password");
	private By LoginButtonLocators = By.xpath("//input[@type='submit']");
	private By forgottenpasswordLinkLocators = By.linkText("Forgotten Password");
	private By LogoutLinkLocators = By.linkText("Logout");
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Methods
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailInputLocators);
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement emailInput = driver.findElement(passwordInputLocators);
		emailInput.sendKeys(password);
	}
	
	public void clickloginButton() {
		WebElement loginbutton = driver.findElement(LoginButtonLocators);
		loginbutton.click();
	}
	
	public void clickForgottenPasswordLink() {
		WebElement forgottenpasswordlink = driver.findElement(forgottenpasswordLinkLocators);
		forgottenpasswordlink.click();
	}
	
	public boolean checkForgotpwdLink() {
		return driver.findElement(forgottenpasswordLinkLocators).isDisplayed();
	}
	
	public boolean checkLogoutLink() {
		return driver.findElement(LogoutLinkLocators).isDisplayed();
	}
	
	public void login(String email,String password) {
		enterEmail(email);
		enterPassword(password);
		clickloginButton();
	}
	
	public String getForgotPwdPageUrl() {
		String forgotPwdPageUrl = driver.getCurrentUrl();
		return forgotPwdPageUrl;
	}
}
