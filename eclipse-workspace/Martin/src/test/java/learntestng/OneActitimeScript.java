package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneActitimeScript {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void configBeforeMethod(String browser, String url) {
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
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
	@Parameters({ "username", "password" })
	public void testScript(String username, String password) {
		SoftAssert softAssert = new SoftAssert();
		Reporter.log("Browser launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		softAssert.assertEquals(driver.getTitle(), "actiTIME - Login", "The Login Page Title is not found correct.");
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/login.do",
				"The Login Page URL is not found correct.");
		// Assert.assertEquals(driver.getCurrentUrl(),
		// "https://demo.actitime.com/login.do");
		Reporter.log("Pass: The Login page Is displayed");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		softAssert.assertTrue(wait.until(ExpectedConditions.urlToBe("https://dem.actitime.com/user/submit_tt.do")),
				"The Home Page URL is not found correct");
		softAssert.assertTrue(wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track")),
				"The Title Of the Home page is not correct.");
		// Assert.assertEquals(driver.getCurrentUrl(),
		// "https://demo.actitime.com/user/submit_tt.do");
		// Assert.assertTrue(wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do")),
		// "The Home Page URL is not found correct");
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		// Assert.assertTrue(wait.until(ExpectedConditions.titleIs("actiTIME - Enter
		// Time-Track")), "The Title Of the Home page is not correct.");
		Reporter.log("Pass: The HomePage is displayed");
		softAssert.assertAll();
	}
}
