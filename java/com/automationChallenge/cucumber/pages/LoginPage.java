package com.automationChallenge.cucumber.pages;

import org.openqa.selenium.WebDriver;

import com.automationChallenge.cucumber.config.FrameworkConfig;
import com.automationChallenge.cucumber.pages.pageObjects.LoginPageObjects;

public class LoginPage {
	//private WebDriver driver = null;
	protected LoginPageObjects loginPage = null;

	public LoginPage(WebDriver driver) {
		loginPage = new LoginPageObjects(driver);
	}
	
	public void login() throws Exception{
		loginPage.findUserName().sendKeys(FrameworkConfig.userName);
		loginPage.findPassword().sendKeys(FrameworkConfig.password);
		loginPage.findSubmitButton().click();
	}


}
