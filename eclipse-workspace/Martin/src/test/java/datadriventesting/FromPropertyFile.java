package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FromPropertyFile {
	public static void main(String[] args) throws IOException {
		// Create the Object of FileInputStream
		FileInputStream fis = new FileInputStream("./src/test/resources/actitime.properties");
		//Create the Properties java class Object
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty("url");
		System.out.println(value);
		
	}
}
