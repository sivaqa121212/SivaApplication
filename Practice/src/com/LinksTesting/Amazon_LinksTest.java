package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_LinksTest {

	public static void main(String[] args)
	
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		
		int linkscount=links.size();
		System.out.println(linkscount);
		
		driver.close();
				
		
		
		

	}

}
