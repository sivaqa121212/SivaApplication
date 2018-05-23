package com.Annoations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("FireFox Browser launch");
	}
	
	@Test(priority=2)
	public void logIn()
	{
		System.out.println("LogIn Funcationality Testing");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Compose Mail Funcationality Testing");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("InBox Funcationality Testing");
	}
}
