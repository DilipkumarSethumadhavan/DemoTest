package autoapp.automation.stepDef;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.awt.Robot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import autoapp.automation.config.FrameworkConfig;
import autoapp.automation.pages.CartSummaryPage;
import autoapp.automation.pages.HomePage;
import autoapp.automation.pages.RegisterPage;
import autoapp.automation.utility.BrowserDrivers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationChallenge{
	
	private BaseSteps base;
	private WebDriver driver;
	private HomePage homePage;
	private CartSummaryPage cartSummaryPage;
	private RegisterPage registerPage;
	private BrowserDrivers browserDriver;
	static final Logger logger = LogManager.getLogger(BaseSteps.class);
	
	public AutomationChallenge(BaseSteps base) throws Exception{
		this.base = base;
		this.driver = this.base.driver;
		this.homePage = this.base.homePage;
		this.registerPage = this.base.registerPage;
		this.cartSummaryPage = this.base.cartSummaryPage;
		this.browserDriver = this.base.browserDriver;
	}

	@Given("^I am in HomePage$")
	public void i_am_in_HomePage() throws Throwable {
		try {
			logger.info(FrameworkConfig.automationChallengeURL);
			driver.get(FrameworkConfig.automationChallengeURL);
			logger.info("Home page url launched successfully");
		} catch (Exception e) {
			logger.info(e.getMessage());
			Assert.fail(e.getMessage());
		}
	}
	
	@When("^I enter incorrect (.+?)$")
	public void i_enter_incorrect(String emailAddress) throws Throwable {
		try {
			logger.info("Incorrect email address : "+emailAddress);
			registerPage.findEmailAddress().sendKeys(emailAddress);
			registerPage.clickSignInButton();
			Thread.sleep(2000);
			logger.info("Entered incorrect email address and clicked sign in");
		} catch (Exception e) {
			logger.info(e.getMessage());
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Validate the errorMessage$")
	public void validate_the_errorMessage() throws Throwable {
		try {
			logger.info("Validate the error message01 - "+registerPage.getErrorMessage01());
			logger.info("Validate the error message01 - "+registerPage.getErrorMessage02());
			assertEquals(registerPage.getErrorMessage01(),FrameworkConfig.emailErrorMessage01);
			assertEquals(registerPage.getErrorMessage02(),FrameworkConfig.emailErrorMessage02);
			registerPage.getErrorMessage02();
			logger.info("Error message validated successfully");
		} catch (Exception e) {
			logger.info(e.getMessage());
			Assert.fail(e.getMessage());
		}
	}


	@Given("^click Sign In$")
	public void click_Sign_In() throws Throwable {
		try {
			homePage.clickSignIn();
			logger.info("Succeccfully clicked Sign In");
		} catch (Exception e) {
			logger.info(e.getMessage());
			Assert.fail(e.getMessage());
		}
	}


	@When("^Select the (.+?) of the T-Shirt and add to cart$")
	public void select_the_of_colour_the_T_Shirt_and_add_to_cart(String colour) throws Throwable {
		try {
			logger.info("Colour of the dress - "+colour);
			homePage.findTShirtColour(colour);
			homePage.clickAddToCart();
			assertEquals(homePage.getQuantity(),FrameworkConfig.quantity);
			homePage.clickProceedToCartAlert();
			logger.info("Added successfully to the cart");
		} catch (Exception e) {
			logger.info(e.getMessage());
			Assert.fail(e.getMessage());
		}
	}

	
	@Then("^Validate the (.+?), (.+?) and (.+?)$")
	public void validate_the_productname_colour_and_quantity(String productName,String colour,String quantity) throws Throwable {
		try{
			logger.info("Name of the product - "+cartSummaryPage.getProductName());
			logger.info("Colour of the dress - "+cartSummaryPage.getColourOfProduct());
			assertEquals(cartSummaryPage.getProductName(), productName);
			assertEquals(cartSummaryPage.getColourOfProduct(), colour);	
			assertEquals(FrameworkConfig.quantity, quantity);	
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@When("^I navigate to summerdresses page using the megamenu$")
	public void i_navigate_to_summerdresses_page_using_the_megamenu() throws Throwable {
		try{
			homePage.navigateToSummerDress();
			logger.info("Navigated to summer dress page");
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Then("^Title is validated (.+?)$")
	public void title_is_validated(String title) throws Throwable {
		try {
			logger.info("Page Title - "+driver.getTitle());
			System.out.println(driver.getTitle());
			assertEquals(driver.getTitle(), title);
			}catch(Exception e) {
				Assert.fail(e.getMessage());
			}
	}
	
	
}
