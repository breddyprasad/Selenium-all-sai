package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String a[]) throws Throwable{
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(new File("input1.properties")));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("browser"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
			
		} finally{
			
		}
		
	}
}
