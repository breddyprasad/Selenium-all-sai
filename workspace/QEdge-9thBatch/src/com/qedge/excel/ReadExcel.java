package com.qedge.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	/* Method is wbook(String filePath)
	 * Reading the Workbook   
	 * parameters are filePath
	 * return type is Workbook
	 */
	public static Workbook wbook(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException{
		File fil=new File(filePath);
		//For reading the  file
		FileInputStream fis=new FileInputStream(fil);
		//For working with workbook
		Workbook wb=WorkbookFactory.create(fis);
		return wb;
	}
	/* indCellData(String filePath, String sheetName, int rowN, int colN) 
	 * Reading the individual cell data 
	 * parameters are filePath, sheetName, row number, column number
	 * return type is String
	 */
	public static String indCellData(String filePath, String sheetName, int rowN, int colN) throws EncryptedDocumentException, InvalidFormatException, IOException{
		Workbook wb=wbook(filePath);
		Sheet s=wb.getSheet(sheetName);
		//For getting row
		Row r=s.getRow(rowN);
		//For getting column
		Cell c=r.getCell(colN);
		//From the particular row and column to get data
		String data=c.getStringCellValue();
		return data;
		
	}
	/* lastRowN(String filePath, String sheetName) 
	 * Reading the last row number  
	 * parameters are filePath, sheetName
	 * return type is integer
	 */
	public static int lastRowN(String filePath, String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
		Workbook wb=wbook(filePath);
		Sheet s=wb.getSheet(sheetName);
		//For getting row
		int lastrow=s.getLastRowNum();
		return lastrow;
	}
	/* allCellData(String filePath, String sheetName, int colN) 
	 * This method is for reading all cell data passing filePath, sheetname and column no. 
	 * parameters are filePath, sheetName, colN
	 * return type is void
	 */
	public static void allCellData(String filePath, String sheetName, int colN) throws EncryptedDocumentException, InvalidFormatException, IOException{
		Workbook wb=wbook(filePath);
		int lastRow=lastRowN(filePath, sheetName);
		Sheet s=wb.getSheet(sheetName);
		
		for (int i = 1; i <= lastRow; i++) {
			Row r=s.getRow(i);
			Cell c=r.getCell(colN);
			String data=c.getStringCellValue();
			System.out.println(data);
		}
		
	}
	
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	/*File fil=new File("TestData.xlsx");
	//For reading the  file
	FileInputStream fis=new FileInputStream(fil);
	//For working with workbook
	Workbook wb=WorkbookFactory.create(fis);
	//For getting sheet
	Sheet s=wb.getSheet("Students");
	//For getting row
	Row r=s.getRow(0);
	//For getting column
	Cell c=r.getCell(1);
	//From the particular row and column to get data
	String data=c.getStringCellValue();
	System.out.println(data);*/
	
	//___________*****************_____________________//
	
	/*String cellData=indCellData("TestData.xlsx", "Students", 1, 1);
	System.out.println(cellData);*/
	
	//___________*****************_____________________//
	
	/*File fil=new File("TestData.xlsx");
	//For reading the  file
	FileInputStream fis=new FileInputStream(fil);
	//For working with workbook
	Workbook wb=WorkbookFactory.create(fis);
	//For getting sheet
	Sheet s=wb.getSheet("Students");
	//For getting row
	int r=s.getLastRowNum();
	System.out.println(r);*/
	
	//___________*****************_____________________//
	
	
	Workbook wb=wbook("TestData.xlsx");
	int lastRow=lastRowN("TestData.xlsx", "Students");
	Sheet s=wb.getSheet("Students");
	
	for (int i = 1; i <= lastRow; i++) {
		Row r=s.getRow(i);
		Cell c=r.getCell(1);
		String data=c.getStringCellValue();
		System.out.println(data);
	}
	
}
}
