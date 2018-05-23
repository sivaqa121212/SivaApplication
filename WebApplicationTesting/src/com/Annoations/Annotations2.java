package com.Annoations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{

	@BeforeTest
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
	
	@AfterTest
	public void ApplicationClose() 
	{
		System.out.println("Close the Browser");
	}
}
