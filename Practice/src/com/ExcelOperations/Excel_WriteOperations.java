package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperations {

	public static void main(String[] args) throws IOException
	
	{
		FileInputStream file= new FileInputStream("C:\\Users\\sivakoganti\\Desktop\\SeleniumPractice\\Practice\\src\\com\\ExcelTestDataFiles\\SivaTestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row r = sheet.createRow(3);
		Cell c = r.createCell(5);
		
		c.setCellValue("Hello");
		
		FileOutputStream file1 = new FileOutputStream("C:\\\\Users\\\\sivakoganti\\\\Desktop\\\\SeleniumPractice\\\\Practice\\\\src\\\\com\\\\ExcelTestDataFiles\\\\SivaTestData.xlsx");
		
		workbook.write(file1);
		
		
		

	}

}
