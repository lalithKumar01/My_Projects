package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnHardAssert {
	WebDriver driver;

	@Test
	public void verifyTitle() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageUrl = driver.getCurrentUrl();
		System.out.println("actualHomePageUrl = " + actualHomePageUrl);
		String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
		System.out.println("expectedHomePageUrl = " + expectedHomePageUrl);
		//Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
		//Assert.assertTrue(actualHomePageUrl.equals(expectedHomePageUrl), "The Home Page URL is found incorrect and it Is verified.");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualHomePageUrl, expectedHomePageUrl, "The Home Page URL is found incorrect and it Is verified.");
		
		
		/*
		 * if (actualHomePageUrl.equals(expectedHomePageUrl)) { System.out.
		 * println("Pass: The Home Page URL is found correct and It Is verified"); }
		 * else { System.out.
		 * println("Fail: The Home Page URL is found incorrect and it Is verified."); }
		 */
		driver.quit();
		soft.assertAll();
	}
}
