package com.NewTours_LogIntTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
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
		driver.close();

	}

}
