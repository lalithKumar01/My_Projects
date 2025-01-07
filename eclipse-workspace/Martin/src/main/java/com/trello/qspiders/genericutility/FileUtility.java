package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is the class will be used to read the data from property file
 * 
 * @author QCSM19
 *
 */
public class FileUtility {
	/**
	 * This method will be used to read the common data from property file.
	 * 
	 * @author Chandan N R
	 * @param key
	 * @return Stringvalue
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trello.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
