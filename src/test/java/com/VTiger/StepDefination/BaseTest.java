package com.VTiger.StepDefination;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseTest {
	public static WebDriver driver;
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver","C:/Selenium_Software/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:100");
		driver.manage().window().maximize();
	}
	

	
	

}
