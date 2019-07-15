package com.automationChallenge.cucumber.utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.automationChallenge.cucumber.config.FrameworkConfig;

public class WebDriverLibrary {


	private WebDriver driver = null;
	private String browser = null;
	public static WebDriver driverInstanceForListener = null;
	static final Logger logger = LogManager.getLogger();

	public WebDriverLibrary() {
		InitializeDriver();
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public String getBrowserName() {
		return browser;
	}

	public void InitializeDriver() {

		browser = System.getProperty("browser");
		try {
			if(browser.equalsIgnoreCase("firefox")) {
				logger.info(browser);
				System.setProperty("webdriver.gecko.driver",FrameworkConfig.geckoDriverPath);
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("chrome")){
				logger.info(browser);
				System.setProperty("webdriver.chrome.driver",FrameworkConfig.chromeDriverPath);
				driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driverInstanceForListener = driver;
		}catch(Exception e){
			driver.quit();
			
		}
	}

	public static WebDriver getDriverInstance() {
		return driverInstanceForListener;
	}
	
	public void HandleAlert() {
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.accept();
	}
	public String getTitle() throws Exception{
		return driver.getTitle();
	}



	public static void selectListOption(List<WebElement> allOptions, String optionToSelect) {
		java.util.Iterator<WebElement> i = allOptions.iterator();
		while (i.hasNext()) {
			WebElement ele = i.next();
			String text = ele.getText();
			if (text.equals(optionToSelect)) {
				ele.click();
				break;
			}
		}
	}
}
