package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		XSSFWorkbook workBok = new XSSFWorkbook(file);
		XSSFSheet sheet = workBok.getSheet("Sheet1");
		
		Row r=sheet.createRow(2);
		Cell c=r.createCell(3);
		
		c.setCellValue("Helloo");
		
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData.xlsx");
		workBok.write(file1);
		
		
		}
}