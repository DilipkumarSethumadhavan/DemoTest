package autoapp.automation.pages.pageObjects;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {

	private WebDriver driver = null;
	protected HomePageObjects homePagePO = null;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement signIn() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Sign in']"));
	}

	public WebElement dresses() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Dresses']"));
	}

	public WebElement summerDresses() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='Summer Dresses']"));
	}

	public void findTShirtColour(String colour) throws Exception {
		driver.navigate()
				.to("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-" + colour);
	}

	public WebElement findAddToCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[normalize-space(text())='Add to cart']")));
		return driver.findElement(By.xpath("//*[normalize-space(text())='Add to cart']"));
	}

	public WebElement findQuantity() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[normalize-space(text())='Quantity']/following::span[1]")));
		return driver.findElement(By.xpath("//*[normalize-space(text())='Quantity']/following::span[1]"));
	}

	public WebElement findProceedToCart() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[normalize-space(text())='Proceed to checkout']")));
		return driver.findElement(By.xpath("//*[normalize-space(text())='Proceed to checkout']"));
	}

	public void findDresses() throws Exception {
		Point coordinates = driver.findElement(By.xpath("//*[normalize-space(text())='Dresses']")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(coordinates.x + 390, coordinates.y + 400);
		// Implicit, Explicit and Fluent wait not working
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	public void findSummerDresses() throws Exception {
		Point coordinates = driver.findElement(By.xpath("//*[normalize-space(text())='Dresses']")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(coordinates.x + 750, coordinates.y + 450);
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Implicit, Explicit and Fluent wait not working
		Thread.sleep(2000);
		// first click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// second click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[normalize-space(text())='Sign
		// In']")));
	}
	
	

}
