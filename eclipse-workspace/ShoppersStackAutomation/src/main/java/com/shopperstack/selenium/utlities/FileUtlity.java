package com.shopperstack.selenium.utlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtlity {
public String getCredentialsFromProprities(String key) throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/shoppersStack.properties");
	Properties prop = new Properties();
	prop.load(file);
	String credentials = prop.getProperty(key);
	return credentials;
}
}

