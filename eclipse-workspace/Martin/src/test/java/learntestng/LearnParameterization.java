package learntestng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameterization {
	WebDriver driver;

	@Test
	@Parameters("browserName")
	public void doParameterization(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}
}
