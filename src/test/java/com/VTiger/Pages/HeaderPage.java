package com.VTiger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	private WebDriver driver;
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Logout")
	WebElement lnk_logout;
	@FindBy(linkText="New Lead")
	WebElement lnk_newlead;
	
	public void ClickLogout()
    {
		lnk_logout.click();
	}
	public void CreateNewLead()
	{
		lnk_newlead.click();
	}

}
