package autoapp.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import autoapp.automation.pages.pageObjects.RegisterPageObjects;

public class RegisterPage {

	private WebDriver driver = null;	
	protected RegisterPageObjects registerPage = null;

	public RegisterPage(WebDriver driver) {
		registerPage = new RegisterPageObjects(driver);
	}
	
	public WebElement findEmailAddress() throws Exception{
		return registerPage.findEmailAddress();
	}
	
	public void clickSignInButton() throws Exception{
		registerPage.findSignInButton().click();
	}
	
	public String getErrorMessage01() throws Exception{
		return registerPage.findErrorMessage01().getText();
	}
	
	public String getErrorMessage02() throws Exception{
		return registerPage.findErrorMessage02().getText();
	}
}
