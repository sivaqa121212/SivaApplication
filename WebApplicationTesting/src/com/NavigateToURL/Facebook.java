package com.NavigateToURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args)
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.navigate().to("http://gmail.com");
		
		driver.close();		
		
		
	}

}
