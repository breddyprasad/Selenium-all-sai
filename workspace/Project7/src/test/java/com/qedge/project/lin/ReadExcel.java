package com.qedge.project.lin;

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
	
	public static Workbook excel() throws EncryptedDocumentException, InvalidFormatException, IOException{
		File fil=new File("D:\\New folder\\QEdge-7thBatch\\ReadExcel.xlsx");
		FileInputStream fis=new FileInputStream(fil);
		Workbook wb=WorkbookFactory.create(fis);
		return wb;
	}
public static String indCellData(String Sheetname, int rowN, int colN) throws EncryptedDocumentException, InvalidFormatException, IOException {
	/*File fil=new File("D:\\New folder\\QEdge-7thBatch\\ReadExcel.xlsx");
	FileInputStream fis=new FileInputStream(fil);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("TestData");
	Row r=s.getRow(0);
	Cell c=r.getCell(1);
	String data=c.getStringCellValue();
	System.out.println(data);*/
	Workbook wb=excel();
	Sheet s=wb.getSheet(Sheetname);
	Row r=s.getRow(rowN);
	Cell c=r.getCell(colN);
	String data=c.getStringCellValue();
	return data;	
}

public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	String data=indCellData("TestData", 0, 1);
	int lastRow=lastRowN("TestData");
	for (int i = 1; i <= lastRow; i++) {
		String data2=indCellData("TestData",  i, 1);
		//boolean verifydata=data2.isEmpty();
		if (data2.isEmpty()) {
			System.out.println("no data");
		}else{
			System.out.println(data2);
		}
		
	}
}

public static int lastRowN(String Sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException{
	Workbook wb=excel();
	Sheet s=wb.getSheet(Sheetname);
	int lastrowN=s.getLastRowNum();
	return lastrowN;
}
}
