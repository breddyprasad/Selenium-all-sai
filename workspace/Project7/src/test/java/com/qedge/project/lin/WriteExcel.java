package com.qedge.project.lin;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteExcel extends ReadExcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	Workbook wb=excel();
	Sheet s1=wb.getSheet("TestData");
	/*Sheet s2=wb.createSheet();
	Sheet s3=wb.createSheet("ecoupons");
	
	Row r3=s3.createRow(0);
	Cell c4=r3.createCell(0);
	c4.setCellValue("ecoupon");
	Row r2=s2.createRow(0);
	Cell c2=r2.createCell(0);
	Cell c3=r2.createCell(1);
	c2.setCellValue("username");
	c3.setCellValue("password");
	Row r1=s1.createRow(11);
	Cell c1=r1.createCell(1);
	c1.setCellValue("Sai");*/
	int activesheet=wb.getActiveSheetIndex();
	wb.getCellStyleAt(1);
	FileOutputStream fos=new FileOutputStream("D:\\New folder\\QEdge-7thBatch\\ReadExcel.xlsx");
	wb.write(fos);
	fos.close();
	
	
}
}
