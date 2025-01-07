package driver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDrivers {
	
public WebDriver driver;
public  WebDriverWait waits ;
public Actions action;
public FileUtlity fileutil = new FileUtlity();
public WebDriverUtility webdriverUtils = new WebDriverUtility();
@BeforeClass
public void Configurebrowser ( ) throws Exception {
	//action = new Actions(driver);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	waits = new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get(fileutil.getCredentialsFromPropertyFile("url"));
}
@AfterClass
public void Quit() {
	//driver.manage().window().minimize();
	//driver.quit();
}

}
