package datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//Data driven testing
public class ScriptFromPropertyFile {
	public WebDriver driver;
	@Test
public void script() throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/actitime.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String browsrerName = pobj.getProperty("browser");
	if (browsrerName.equals("chrome")) {
		driver = new ChromeDriver();
	}else if (browsrerName.equals("edge")) {
		driver = new EdgeDriver();
	}else if (browsrerName.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if (browsrerName.equals("safari")) {
		driver = new SafariDriver(); 
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get(pobj.getProperty("url"));
	driver.findElement(By.id("username")).sendKeys(pobj.getProperty("username"));
	driver.findElement(By.name("pwd")).sendKeys(pobj.getProperty("password"));
	driver.findElement(By.id("loginButton")).click();

}
}
