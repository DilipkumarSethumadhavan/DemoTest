package com.automationChallenge.cucumber.pages;

import org.openqa.selenium.WebDriver;

import com.automationChallenge.cucumber.config.FrameworkConfig;
import com.automationChallenge.cucumber.pages.pageObjects.ViewOrderListPageObjects;

public class ViewOrderListPage {
	
	private WebDriver driver = null;
	protected ViewOrderListPageObjects viewOrderListPage = null;

	public ViewOrderListPage(WebDriver driver) {
		viewOrderListPage = new ViewOrderListPageObjects(driver);
	}
	
	public void clickOrder() throws Exception {
		viewOrderListPage.findOrder().click();
	}
	public void clickViewAllOrders() throws Exception {
		viewOrderListPage.findViewAllOrders().click();
	}
	public String getFullDetails() throws Exception {
		return viewOrderListPage.findFullDetails().getText();
	}
	public void clickEdit() throws Exception {
		viewOrderListPage.findEdit().click();
	}
	public void clickCheckBox() throws Exception {
		viewOrderListPage.findCheckBox().click();
	}
	public void clickDeleteButton() throws Exception {
		viewOrderListPage.findDeleteButton().click();
	}
	public void clickLogout() throws Exception {
		viewOrderListPage.findLogout().click();
	}

}
