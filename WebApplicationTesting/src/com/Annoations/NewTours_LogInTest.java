package com.Annoations;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest 
{

	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void logIn()
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");;
		driver.findElement(By.name("password")).sendKeys("tutorial");;
		
		//  name="login">
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedTitle="Find";
		String ActualTile=driver.getTitle();
		
		System.out.println(ExpectedTitle+"  "+"ExpectedTitle");
		System.out.println(ActualTile+"  "+"ActualTitle");
		
		if(ActualTile.contains(ExpectedTitle))

		{
			System.out.println("LogIn Successful -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
}
