package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_linksTesting {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
	WebElement	HeaderBlok=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderLinks=HeaderBlok.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		for(int i=0;i<HeaderLinks.size();i++)
		{
			String LinkName=HeaderLinks.get(i).getText();
			System.out.println(i+"  "+		LinkName);
			
			HeaderLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			
			driver.navigate().back();
			
			Thread.sleep(10000);
			
			HeaderBlok=driver.findElement(By.className("menu-wrap"));
			
			
			HeaderLinks=HeaderBlok.findElements(By.tagName("a"));
		}
		
		driver.close();

	}

}
