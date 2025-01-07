package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtlity {
 public String getCredentialsFromPropertyFile(String key) throws IOException {
	 FileInputStream file = new FileInputStream("./src/test/resources/3DX.properties");
	 Properties prop = new Properties();
	 prop.load(file);
	 String value = prop.getProperty(key);
	return value;
	 
 }
}
