package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingLInksNames_NewToursHomePage {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:/newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int LinksCount=links.size();
		System.out.println(LinksCount);
		
		for(int k=0;k<links.size();k++)
		{
			String linkName =links.get(k).getText();
			System.out.println(k+"  "+linkName);
			
			links.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
			
			
			
		}
		
		driver.close();
		

	}

}
