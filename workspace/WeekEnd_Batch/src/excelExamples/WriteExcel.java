package excelExamples;

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
	
	int activesheet=wb.getActiveSheetIndex();
	wb.getCellStyleAt(1);
	FileOutputStream fos=new FileOutputStream("ReadExcel.xlsx");
	wb.write(fos);
	fos.close();
	
	
}
}
