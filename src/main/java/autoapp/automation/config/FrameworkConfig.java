package autoapp.automation.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class FrameworkConfig {
	public static final String curPrjLoc = System.getProperty("user.dir");
	public static final String chromeDriverPath = curPrjLoc+"\\Drivers\\chromedriver.exe";
	public static final String geckoDriverPath = curPrjLoc+"\\Drivers\\geckodriver.exe";
	//public static final String ieDriverPath = "C:\\Users\\Documents\\geckodriver.exe";	
	public static String automationChallengeURL = "http://automationpractice.com/index.php";
	public static String emailErrorMessage01 = "There is 1 error";
	public static String emailErrorMessage02 = "Invalid email address.";
	public static Object quantity = "1";
	public static Object title = "Summer Dresses - My Store";

}
