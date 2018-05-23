package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Title {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
