package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHandling {
	
	public static void main(String a[]) throws Throwable{
		File f = new File("a.txt");
		File f1 = new File("b.txt");
		if(!f1.exists())
			f1.createNewFile();
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f1);
		
		int i;
		while((i = fis.read())!= -1){
			fos.write(i);
		}
		fis.close();
		fos.close();
	}

}
