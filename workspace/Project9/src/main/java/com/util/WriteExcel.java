package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel extends ReadExcel {
	/* Method is wbook(String filePath)
	 * Reading the Workbook   
	 * parameters are filePath
	 * return type is Workbook
	 */
	
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	File fil=new File("TestData.xlsx");
	//For reading the  file
	FileInputStream fis=new FileInputStream(fil);
	//For working with workbook
	Workbook wb=WorkbookFactory.create(fis);
	//For creating sheet
	Sheet s=wb.getSheet("Students");
	//For creating row
	Row r=s.createRow(0);
	//For creating column
	Cell c=r.createCell(3);
	//Set the data in to the string
	c.setCellValue("present");
	//For writing the data in to the specified file
	FileOutputStream fos=new FileOutputStream(fil);
	//For writing the data in to the workbook
	wb.write(fos);
	//To close the file
	fos.close();
	
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
	
	

}
}
