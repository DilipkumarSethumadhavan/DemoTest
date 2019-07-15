package com.automationChallenge.cucumber.pages;

import org.openqa.selenium.WebDriver;

import com.automationChallenge.cucumber.config.FrameworkConfig;
import com.automationChallenge.cucumber.pages.pageObjects.OrderPageObjects;

public class OrderPage {

	private WebDriver driver = null;
	protected OrderPageObjects orderPage = null;

	public OrderPage(WebDriver driver) {
		orderPage = new OrderPageObjects(driver);
	}
	
	public void enterOrderDetails() throws Exception{
		orderPage.findQuantity().sendKeys(FrameworkConfig.Quantity);
		orderPage.findCustomerName().sendKeys(FrameworkConfig.customerName);
		orderPage.findStreet().sendKeys(FrameworkConfig.street);
		orderPage.findCity().sendKeys(FrameworkConfig.city);
		orderPage.findState().sendKeys(FrameworkConfig.state);
		orderPage.findZip().sendKeys(FrameworkConfig.zip);
		orderPage.findCard().click();
		orderPage.findCardNo().sendKeys(FrameworkConfig.cardNo);
		orderPage.findExpireDate().sendKeys(FrameworkConfig.epireDate);
		orderPage.findProcess().click();
	}
	
	public void editOrderDetails() throws Exception{
		orderPage.findCardNo().clear();
		orderPage.findCardNo().sendKeys(FrameworkConfig.newCardNo);
		orderPage.findUpdateButton().click();
	}
	/*public void setQuantity() throws Exception {
		orderPage.findQuantity().sendKeys(FrameworkConfig.Quantity);
	}
	public void setCustomerName() throws Exception {
		orderPage.findCustomerName().sendKeys(FrameworkConfig.customerName);
	}
	public void setStreet() throws Exception {
		orderPage.findStreet().sendKeys(FrameworkConfig.street);
	}
	public void setCity() throws Exception {
		orderPage.findCity().sendKeys(FrameworkConfig.city);
	}
	public void setState() throws Exception {
		orderPage.findState().sendKeys(FrameworkConfig.state);
	}
	public void setZip() throws Exception {
		orderPage.findZip().sendKeys(FrameworkConfig.zip);
	}
	public void setCardNo() throws Exception {
		orderPage.findCardNo().sendKeys(FrameworkConfig.cardNo);
	}
	public void setExpireDate() throws Exception {
		orderPage.findExpireDate().sendKeys(FrameworkConfig.epireDate);
	}
	public void clickProcessButton() throws Exception {
		orderPage.findProcess().click();
	}
	public void clickCard() throws Exception {
		orderPage.findCard().click();
	}*/

}
