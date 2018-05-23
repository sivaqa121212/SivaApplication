package com.Annoations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeMethod
	public void ApplicationLanchAndLogIn()
	{
		System.out.println("Application launch and LogIN");
	}
	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("Compose Mail Funcationality Testing");
	}
	
	@Test(priority=2)
	public void InBox()
	{
		System.out.println("InBox Funcationality Testing");
	}
	
	@AfterMethod
	public void ApplicationClose() 
	{
		System.out.println("Close the Browser");
	}
	
}
