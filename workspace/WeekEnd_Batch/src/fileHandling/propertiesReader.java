package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {
	public String getValue(String key) {
		Properties p = new Properties();
		String value = "";
		try {
			p.load(new FileInputStream(new File("data.properties")));
			value= p.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
