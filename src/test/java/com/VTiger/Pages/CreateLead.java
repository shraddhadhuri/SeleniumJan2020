package com.VTiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead extends HeaderPage {

	private WebDriver driver;
	public CreateLead(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="lastname")
	WebElement txt_lastName;
	@FindBy(name="company")
	WebElement txt_company;
	@FindBy(name="button")
	WebElement btn_Save;
	@FindBy(xpath="//td[text()='Last Name:']/following::td[1]")
	WebElement txt_expcted;
	
	
	
	public boolean NewLead(String LName,String CName)
	{
		txt_lastName.sendKeys(LName);
		txt_company.sendKeys(CName);
		btn_Save.click();
		if(txt_expcted.getText().equals(LName))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
}
