package com.automationChallenge.cucumber.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class FrameworkConfig {
	public static final String curPrjLoc = System.getProperty("user.dir");
	public static final String chromeDriverPath = curPrjLoc+"\\Drivers\\chromedriver.exe";
	public static final String geckoDriverPath = curPrjLoc+"\\Drivers\\geckodriver.exe";
	//public static final String ieDriverPath = "C:\\Users\\Documents\\geckodriver.exe";	
	public static String automationChallengeURL = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
	public static String userName = "Tester";
	public static String password = "test";
	public static String Quantity= "11";
	public static String customerName = "Sam John";
	public static String street = "Latrobe Street";
	public static String city = "Melbourne";
	public static String state = "Vic";
	public static String zip = "3008";
	public static String cardNo = "1234567890123456";
	public static String newCardNo = "9876543210123456";
	public static String epireDate = "12/23";
	public static String product = "MyMoney";
	public static String card = "MasterCard";
	static LocalDateTime ldt = LocalDateTime.now();
	public static String date = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(ldt);
	public static String title = "Web Orders";
	public static String loginTitle = "Web Orders Login";
	public static String newOrderFullDetails = "Sam John MyMoney 11 "+date+" Latrobe Street Melbourne Vic 3008 MasterCard 1234567890123456 12/23";
	public static String editOrderFullDetails = "Sam John MyMoney 11 "+date+" Latrobe Street Melbourne Vic 3008 MasterCard 9876543210123456 12/23";
	


}
