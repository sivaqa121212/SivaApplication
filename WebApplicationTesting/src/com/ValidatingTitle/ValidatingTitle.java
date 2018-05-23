package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle {

	public static void main(String[] args)
	{
		
     FirefoxDriver driver = new FirefoxDriver();
     driver.get("https://www.yahoo.com/");
     
     driver.manage().window().maximize();
     String ExpectedTitle = "Yahoo";
     
      System.out.println(ExpectedTitle);	
     
     String ActualTitle=driver.getTitle();
     System.out.println(ActualTitle);
     
     if (ActualTitle.equals(ExpectedTitle))
     {
    	 System.out.println("Pass");
    	 
     }
    	
     else
    	 
    		 
    	 {
    		 
    		 System.out.println("Fail");
    		 
    	 }
    		 
    		
    	 driver.close(); 
       	
}

}
