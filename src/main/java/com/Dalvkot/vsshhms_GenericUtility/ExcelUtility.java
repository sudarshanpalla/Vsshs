package com.Dalvkot.vsshhms_GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 *@author Sudarshan palla
 *
 */

public class ExcelUtility {
	
	/**
	 * it is used to fetch the data from Excel sheet
	 * @throws Throwable 
	 *
	 */
	public String getDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		
		FileInputStream fis =new FileInputStream("C:\\Users\\sudarshan\\git\\repository\\com.Dalvkot.vsshhms2\\src\\main\\resources\\CommanData\\TestData.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(cellNum);
		String data = cel.getStringCellValue();
		
		wb.close();
		return data;
	}
	
	/**
	 * it is used to get the last used number on specified sheet
	 * @throws Throwable 
	 */
	public int getRowCount(String sheetName) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("D:\\Eclipse\\com.Dalvkot.vsshhms2\\src\\main\\resources");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		wb.close();
		return sh.getLastRowNum();
	}
	/**
	 * it is used to write the data inside the sheet
	 * @throws Throwable 
	 */
	public void setDataExcel(String sheetName,int rowNum,int celNum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream("D:\\Eclipse\\com.Dalvkot.vsshhms2\\src\\main\\resources");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./");
		wb.write(fos);
		wb.close();
		
	}

}
