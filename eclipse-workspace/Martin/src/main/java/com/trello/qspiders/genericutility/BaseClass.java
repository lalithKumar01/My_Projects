package com.trello.qspiders.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import driver.WebDriverUtility;

public class BaseClass {
	 public WebDriver driver;
	 public FileUtility fileUtils = new FileUtility();
	// public WebDriverUtility webdriverUtils = new WebDriverUtility();

	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		String browserName = fileUtils.readDataFromPropertyFile("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options) ;
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		//driver.get(fileUtils.readDataFromPropertyFile("flip"));
		driver.get(fileUtils.readDataFromPropertyFile("upload"));
	}
	//@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
