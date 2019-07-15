package com.automationChallenge.cucumber.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	private WebDriver driver = null;
	protected LoginPageObjects loginPO = null;
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement findUserName() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Username:']/following::input[1]"));
	}

	public WebElement findPassword() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Password:']/following::input[1]"));
	}

	public WebElement findSubmitButton() throws Exception {
		return driver.findElement(By.id("ctl00_MainContent_login_button"));
	}

}
