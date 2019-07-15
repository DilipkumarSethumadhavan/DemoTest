package com.automationChallenge.cucumber.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationChallenge.cucumber.config.FrameworkConfig;

public class ViewOrderListPageObjects {
	private WebDriver driver = null;
	protected ViewOrderListPageObjects ViewOrderListPO = null;
	public ViewOrderListPageObjects(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement findOrder() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Order']"));
	}

	public WebElement findViewAllOrders() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='View all orders']"));
	}
	public WebElement findFullDetails() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Exp']/following::tr[1]"));
	}
	/*** Newly added customer validation xpath ***/
	
	public WebElement findEdit() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='"+FrameworkConfig.customerName+"']/following::td[11]"));
	}
	public WebElement findCheckBox() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='"+FrameworkConfig.customerName+"']/preceding::input[1]"));
	}
	public WebElement findDeleteButton() throws Exception{
		return driver.findElement(By.id("ctl00_MainContent_btnDelete"));
	}
	public WebElement findLogout() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Logout']"));
	}	
}
