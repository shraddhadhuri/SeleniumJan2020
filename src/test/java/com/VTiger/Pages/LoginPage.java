package com.VTiger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	private String expected="vtiger CRM - Commercial Open Source CRM123" ;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * By txt_Username=By.name("user_name"); By txt_pwd=By.name("user_password"); By
	 * btn_Login=By.name("Login"); By
	 * logo_img=By.xpath("//img[@src='include/images/login_left.gif']"); //
	 *///	
	@FindBy(name="user_name")
   WebElement txt_Username;
   @FindBy(how=How.NAME,using="user_password")
   WebElement txt_pwd;
   @FindBy(name="Login")
   WebElement btn_Login;
   @FindBy(xpath="//img[@src='include/images/login_left.gif']")
   WebElement logo_img;
   @FindBy(xpath="//*[contains(text(),'You must specify a valid username and password.')]")
   WebElement error_msg;
	
	
	public void login()
	{
//		driver.findElement(txt_Username).sendKeys("admin");
//		driver.findElement(txt_pwd).sendKeys("admin");
//		driver.findElement(btn_Login).click();
		txt_Username.clear();
		txt_Username.sendKeys("admin");
		txt_pwd.clear();
		txt_pwd.sendKeys("admin");
		btn_Login.click();
	}
	
	public void InvalidLogin(String userid,String password)
	{
		txt_Username.clear();
		txt_Username.sendKeys(userid);
		txt_pwd.clear();
		txt_pwd.sendKeys(password);
		btn_Login.click();
	}
	public boolean VerifyTitle()
	{
		if(expected.equals(driver.getTitle().trim()))
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	public boolean VerifyLogo()
	{
		if(logo_img.isDisplayed())
		{
		return true;
		}
		else
		{
		return false;
		}
		
	}
	public boolean VerifyErrorMsg()
	{
		if(error_msg.isDisplayed())
		{
		return true;
		}
		else
		{
		return false;
		}
		
	}
}
