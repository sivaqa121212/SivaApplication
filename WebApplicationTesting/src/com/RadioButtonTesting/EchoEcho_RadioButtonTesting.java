package com.RadioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButtonTesting {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>radio=block.findElements(By.name("group1"));
		
		for(int k=0;k<radio.size();k++)
		{
			radio.get(k).click();
			
			for(int p=0;p<radio.size();p++)
			{
				System.out.println(radio.get(p).getAttribute("value")+"  "+radio.get(p).getAttribute("checked"));
			}
		}

	}

}
