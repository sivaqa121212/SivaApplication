package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTours_LogInTest 
{

	FirefoxDriver driver;
	
	@Given("^Open FireFox Browser and navigate to newTours Application$")
	public void Open_FireFox_Browser_and_navigate_to_newTours_Application() throws Throwable
	{
	    driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com");
		
	}

	/*@When("^User enters valid UserName and Password and CLick on SignIn button$")
	public void User_enters_valid_UserName_and_Password_and_CLick_on_SignIn_button() throws Throwable
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");;
		driver.findElement(By.name("password")).sendKeys("tutorial");;
		
		//  name="login">
		driver.findElement(By.name("login")).click();
		
		
	}*/
	
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and CLick on SignIn button$")
	public void User_enters_valid_and_and_CLick_on_SignIn_button(String UserName, String Password) 
	{
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		//  name="login">
		driver.findElement(By.name("login")).click();
		
	}

	@Then("^User should be able to successfully LogIn and Close the application$")
	public void User_should_be_able_to_successfully_LogIn_and_Close_the_application() throws Throwable 
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedTitle="Find";
		String ActualTile=driver.getTitle();
		
		System.out.println(ExpectedTitle+"  "+"ExpectedTitle");
		System.out.println(ActualTile+"  "+"ActualTitle");
		
		if(ActualTile.contains(ExpectedTitle))

		{
			System.out.println("LogIn Successful -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
		
		driver.close();
	}
	
}
