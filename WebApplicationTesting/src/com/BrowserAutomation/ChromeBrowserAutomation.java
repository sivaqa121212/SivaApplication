package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ChromeBrowserAutomation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		
		Sleeper.sleepTight(10);
		
		//driver.close();

	}

}
