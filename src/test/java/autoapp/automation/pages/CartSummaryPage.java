package autoapp.automation.pages;

import org.openqa.selenium.WebDriver;

import autoapp.automation.pages.pageObjects.CartSummaryPageObjects;

public class CartSummaryPage {
	private WebDriver driver = null;
	protected CartSummaryPageObjects cartSummaryPage = null;

	public CartSummaryPage(WebDriver driver) {
		cartSummaryPage = new CartSummaryPageObjects(driver);
	}
	
	public String getProductName() throws Exception{
		return cartSummaryPage.findProductName().getText();
	}

	public String getColourOfProduct() throws Exception{
		return cartSummaryPage.findColourOfProduct().getText().substring(8, 12).toLowerCase();
	}

	public void getQuantity() throws Exception{
		cartSummaryPage.findQuantity().getAttribute("value");
		System.out.println(cartSummaryPage.findQuantity().getAttribute("value"));
	}

}
