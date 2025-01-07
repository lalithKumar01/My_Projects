package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OneGoodScriptforParallel {
	WebDriver driver;
	@Parameters({"browserName","url"})
	@BeforeMethod
	public void configBeforeMethod(String browserName, String url) {
		if (browserName.equals("chrome")) {
			driver= new ChromeDriver();
		}else if (browserName.equals("edge")) {
			driver= new EdgeDriver();
		}else if (browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}

	@Test
	@Parameters({"username","password"})
	public void actiTimeLoginLogout(String username, String password) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink"))).click();
	}
	
}