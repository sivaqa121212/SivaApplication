package com.FacebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		//  id="email"
		
		driver.findElement(By.id("email")).sendKeys("Hellooo");
		
		// id="pass"
		
		driver.findElement(By.id("pass")).sendKeys("Hiiii");
		
		// id="loginbutton"
		
		driver.findElement(By.id("loginbutton")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();

	}

}
