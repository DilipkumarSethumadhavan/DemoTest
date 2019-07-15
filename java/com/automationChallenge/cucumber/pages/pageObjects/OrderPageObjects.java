package com.automationChallenge.cucumber.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPageObjects {
	private WebDriver driver = null;
	protected OrderPageObjects orderPO = null;
	public OrderPageObjects(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement findQuantity() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Quantity:']/following::input[1]"));
	}

	public WebElement findCustomerName() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Customer name:']/following::input[1]"));
	}
	public WebElement findStreet() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Street:']/following::input[1]"));
	}
	public WebElement findCity() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='City:']/following::input[1]"));
	}
	public WebElement findState() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='State:']/following::input[1]"));
	}
	public WebElement findZip() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Zip:']/following::input[1]"));
	}
	public WebElement findCard() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Card:']/following::input[2]"));
	}
	public WebElement findCardNo() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Card Nr:']/following::input[1]"));
	}
	public WebElement findExpireDate() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Expire date (mm/yy):']/following::input[1]"));
	}
	public WebElement findProcess() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Process']"));
	}
	public WebElement findUpdateButton() throws Exception{
		return driver.findElement(By.xpath("//*[normalize-space(text())='Update']"));
	}	
}
