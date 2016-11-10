package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {
	
	public static void main(String arg[]) throws Throwable{
		File f = new File("file1.txt");
		File f1 = new File("file2.txt");
		if(f1.exists()){
			f1.delete();
			System.out.println("exist--> "+f1.exists());
			f1.createNewFile();
		}
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f1);
		
		int i = 0;
		
		while((i = fis.read()) != -1){
			fos.write(i);
		}
		
		
	}

}
