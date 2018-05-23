package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
	// Object Repository
	
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	public void SignOn()
	{
		SignOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
	Register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	
	public void support()
	{
	Support.click();
	
	}
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignOff;
	
	public void LogIn(String UName,String Pwd)
	{
		UserName.sendKeys("UName");
		Password.sendKeys("Pwd");
		SignOff.click();
	}
	
	
}
