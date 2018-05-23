package com.NewTours_LogIntTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComparingTitle {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("tutorials");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// Login
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedTitle = "Sign-on";
		String ActualTitle = driver.getTitle();
		
		System.out.println(ExpectedTitle +"  " +"ExpectedTitle" );
		System.out.println(ActualTitle +"   "+ "ActualTitle");
		
		if (ActualTitle.contains(ExpectedTitle))
		{		
			System.out.println("Pass");
	}
		
		else
			
		{
			
			System.out.println("Fail");
			
		}
		}
		
	
		
		
		

	}


