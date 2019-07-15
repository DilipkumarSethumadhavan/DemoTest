package autoapp.automation.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	private WebDriver driver = null;
	protected RegisterPageObjects registerPO = null;
	public RegisterPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement findSignInButton() throws Exception{
		return driver.findElement(By.id("SubmitLogin"));
	}
	
	public WebElement findEmailAddress() throws Exception{
		return driver.findElement(By.xpath("//*[normalize-space(text())='Email address']/following::input[4]"));
	}
	
	public WebElement findErrorMessage01() throws Exception{
		return driver.findElement(By.xpath("//*[normalize-space(text())='There is 1 error']"));
	}
		

	public WebElement findErrorMessage02() throws Exception{
		return driver.findElement(By.xpath("//*[normalize-space(text())='There is 1 error']//following::li[1]"));
	}
}


