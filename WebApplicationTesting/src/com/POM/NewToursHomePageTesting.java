package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{

	@Test
	public void HomePageTestig()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.register();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.SignOn();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.LogIn("tutorial", "tutorial");
		

		driver.close();
		
		
		
		
		
		
		
		
		
	}
	
	
}
