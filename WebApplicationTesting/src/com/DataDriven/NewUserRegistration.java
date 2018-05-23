package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUserRegistration 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	
	public void UserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Siva");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("88999865");
		driver.findElement(By.name("userName")).sendKeys("Siva12122");
		driver.findElement(By.name("address1")).sendKeys("12345");
		driver.findElement(By.name("address2")).sendKeys("Kphb");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("TElangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Sivaaaaaa");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Sivaaaaaa";
		String actual_RegisteredUsers=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		
		if(actual_RegisteredUsers.contains(expected_UserName))
		{
			System.out.println("New User registered successfully -- PASS");
		}
		else
		{
			System.out.println("New User Registration Failed -- FAIL");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
