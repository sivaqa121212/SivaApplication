package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:\\fb.com");
		// email id
		
		driver.findElement(By.id("email")).sendKeys("siva121212@gmail.com");
		
		// id Pass 
		
		driver.findElement(By.id("pass")).sendKeys("satvik123");
		
		
		// Login ID
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.close();

	}

}
