package autoapp.automation.pages.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartSummaryPageObjects {

	private WebDriver driver = null;
	protected CartSummaryPageObjects cartSummaryPO = null;
	public CartSummaryPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findProductName() throws Exception{
		return driver.findElement(By.xpath("//*[normalize-space(text())='']/following::td/following::a[2]"));
	}

	public WebElement findColourOfProduct() throws Exception {
		return driver.findElement(By.xpath("//*[normalize-space(text())='']/following::td/following::a[3]"));
	}

	public WebElement findQuantity() throws Exception{
		return driver.findElement(By.xpath("/html/body[@id='order']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row'][2]/div[@id='center_column']/div[@id='order-detail-content']/table[@id='cart_summary']/tbody/tr[@id='product_1_1_0_0']/td[@class='cart_quantity text-center']/input[@class='cart_quantity_input form-control grey']"));
	}
}
