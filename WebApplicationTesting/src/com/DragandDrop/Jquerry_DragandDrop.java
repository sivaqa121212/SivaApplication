package com.DragandDrop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquerry_DragandDrop {

	public static void main(String[] args) 
	
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement source =  driver.findElementById("draggable");
		
		WebElement target =  driver.findElementById("droppable");
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		
		
		
		
				
		

	}

}
