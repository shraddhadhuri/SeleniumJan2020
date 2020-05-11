package com.VTiger.StepDefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.VTiger.Pages.HeaderPage;
import com.VTiger.Pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps extends BaseTest{


	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:/Selenium_Software/chromedriver.exe");
		openURL();
	    
	}

	@When("^user enters valid id and password$")
	public void user_enters_valid_id_and_password() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
	   System.out.println("chcek home page");
	    
	}

	@Then("^Logout link should be visible$")
	public void logout_link_should_be_visible() throws Throwable {
		HeaderPage hp=new HeaderPage(driver);
		hp.ClickLogout();
		
	}
	@Then("^close application$")
	public static void close_application() throws Throwable {
	   driver.quit();
	 }

	@When("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String userid, String password) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.InvalidLogin(userid, password);
	   
	}

	@Then("^user should be on login page with error message$")
	public void user_should_be_on_login_page_with_error_message() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.VerifyErrorMsg();
	    
	}

	@Then("^message should be \"([^\"]*)\"$")
	public void message_should_be(String arg1) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.VerifyErrorMsg();
	}

	@Then("^\"([^\"]*)\" should be matched$")
	public void should_be_matched(String arg1) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.VerifyTitle();
	}

	@Then("^logo should be displayed$")
	public void logo_should_be_displayed() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.VerifyLogo();
	}
	
	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials(DataTable usercredentials) throws Throwable {
		//Write the code to handle Data Table
		 List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		 driver.findElement(By.name("user_name")).sendKeys(data.get(0).get("userid")); 
		     driver.findElement(By.name("user_password")).sendKeys(data.get(0).get("password"));
		     driver.findElement(By.name("Login")).click();
		           }
	}

