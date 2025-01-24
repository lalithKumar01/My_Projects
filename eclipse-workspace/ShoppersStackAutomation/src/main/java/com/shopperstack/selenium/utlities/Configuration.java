package com.shopperstack.selenium.utlities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Configuration {
 public WebDriver driver;
 public WebDriverWait wait;
 public FileUtlity fileutils = new FileUtlity() ;
 @BeforeClass 
 public void BrowserConfigure() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 wait= new WebDriverWait(driver, Duration.ofMinutes(1));
 }
 
 
 @AfterClass
 public void afterClass() {
		driver.quit();
	}
 
}
