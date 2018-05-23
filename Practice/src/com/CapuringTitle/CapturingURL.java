package com.CapuringTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingURL 
{
	public static void main(String[] args) 
	
	{
		
FirefoxDriver driver= new FirefoxDriver();

	driver.get("http://fb.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.close();
}

}