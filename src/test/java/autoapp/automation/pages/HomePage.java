package autoapp.automation.pages;

import org.openqa.selenium.WebDriver;

import autoapp.automation.pages.pageObjects.HomePageObjects;

public class HomePage {
	private WebDriver driver = null;
	protected HomePageObjects homePage = null;

	public HomePage(WebDriver driver) {
		homePage = new HomePageObjects(driver);
	}
	
	public void clickSignIn() throws Exception{
		homePage.signIn().click();
		}
	public void dresses() throws Exception{
		homePage.dresses().click();
		}
	public void summerDresses() throws Exception{
		homePage.summerDresses().click();
		}

	public void findTShirtColour(String colour) throws Exception {
		homePage.findTShirtColour(colour);
	}

	public void clickAddToCart() throws Exception{
		homePage.findAddToCart().click();
		
	}

	public void clickProceedToCartAlert() throws Exception{
		 homePage.findProceedToCart().click();		
	}

	public String getQuantity() throws Exception{
		return homePage.findQuantity().getText();
	}
	public void navigateToSummerDress() throws Exception{
		homePage.findDresses();
		homePage.findSummerDresses();
	}

	
		
}
