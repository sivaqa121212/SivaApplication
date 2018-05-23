package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTouirs_HomePage_LinksCount {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:/newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int LinksCount=links.size();
		System.out.println(LinksCount);
		
		driver.close();
		

	}

}
