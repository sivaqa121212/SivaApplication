package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration_TestData
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
	
	public void UserRegistration() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NewUserRegistration.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
		
			Row r=sheet.getRow(i);
		
		
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		double x=r.getCell(2).getNumericCellValue();
		long y=(long)x;
		String PhoneNumber=Long.toString(y);
		
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("address2")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(6).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(7).getStringCellValue());
		
		double p=r.getCell(8).getNumericCellValue();
		long k=(long)p;
		String PostalCode=Long.toString(k);
		
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.id("email")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(12).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName=r.getCell(10).getStringCellValue();
		String actual_RegisteredUsers=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		
		if(actual_RegisteredUsers.contains(expected_UserName))
		{
			System.out.println("New User registered successfully -- PASS");
			r.createCell(13).setCellValue("New User registered successfully -- PASS");
		}
		else
		{
			System.out.println("New User Registration Failed -- FAIL");
			r.createCell(13).setCellValue("New User Registration Failed -- FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\WebApplicationTesting\\src\\com\\ExcelTestResultFiles\\NewUserRegistrationResult.xlsx");
		workBook.write(file1);
		
		
		driver.navigate().back();
	}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
