package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingAlert {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text=alt.getText();
		
		System.out.println(text);
		
		Sleeper.sleepTightInSeconds(10);
		alt.accept();
		
		//alt.dismiss();
		
		//alt.sendKeys("Hellooo");

	}

}
