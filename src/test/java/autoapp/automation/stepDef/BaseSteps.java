package autoapp.automation.stepDef;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import autoapp.automation.pages.CartSummaryPage;
import autoapp.automation.pages.HomePage;
import autoapp.automation.pages.RegisterPage;

import autoapp.automation.utility.BrowserDrivers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseSteps {
	public BrowserDrivers browserDriver = new BrowserDrivers();
	public WebDriver driver;
	public RuntimeOptions runtimeOptions = null;
	public HomePage homePage;
	public RegisterPage registerPage;
	public CartSummaryPage cartSummaryPage;
	static final Logger logger = LogManager.getLogger(BaseSteps.class);

	public BaseSteps() {
		logger.info("Base steps constructor - started");
		driver = browserDriver.getWebDriver();
		// Initialize page classes
		homePage = new HomePage(driver);
		registerPage = new RegisterPage(driver);
		cartSummaryPage = new CartSummaryPage(driver);
		RuntimeOptionsFactory runtimeOptionsFactory = new RuntimeOptionsFactory(this.getClass());
		runtimeOptions = runtimeOptionsFactory.create();
		logger.info("Base steps constructor - finished");
	}	

	@Before
	public void logScenarioStartInfo(Scenario scenario) {
		logger.info("*********** Started running cucumber scenario -- " + scenario.getName() + " ***************");
	}
	
	@After
	public void embedScreenshot(Scenario scenario) throws IOException {
		logger.info("@After - started");
		if (scenario.isFailed()) {
			scenario.write("Current Page URL is: " + driver.getCurrentUrl());
			scenario.write(
					"Scenario '" + scenario.getName() + "' Failed on broswer : '" + browserDriver.getWebDriver() + "'");
			try {
				BufferedImage bufferedImage = new AShot()// Library
						.shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver).getImage();
				ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
				ImageIO.write(bufferedImage, "png", byteOutputStream);
				byteOutputStream.flush();
				byte[] byteImage = byteOutputStream.toByteArray();
				byteOutputStream.close();
				scenario.embed(byteImage, "image/png");
			} catch (Exception e) {
				e.getMessage();
			}
			logger.info("@After - finished");
		}
		if (driver != null) {
			driver.quit();
		}
		logger.info("************* Finished running cucumber scenario -- " + scenario.getName() + " *****************");
	}
}
