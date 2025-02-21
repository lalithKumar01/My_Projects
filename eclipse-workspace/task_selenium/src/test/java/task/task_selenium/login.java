package task.task_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class login {
	
	WebDriver driver ;
	
	WebDriverWait wait;
	
	String mobileNum = "654989829758";
	String otp = "565656";
	String name = "Test";
	String emailId = "test@gmail.com";
	
	@Test
	public void automateLogin() throws Exception  {
	
     driver = new ChromeDriver();
     
     wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
	driver.manage().window().maximize();
	
	driver.get("https://pp-web.flurn.in/login");
	
	driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys(mobileNum);
	
	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	
	WebElement otpTextBox = driver.findElement(By.xpath("//input[@placeholder = 'Enter the OTP sent your phone']"));
	
	
	wait.until(ExpectedConditions.visibilityOf(otpTextBox));
	
	otpTextBox.sendKeys(otp);
	
	
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	
	/*driver.findElement(By.xpath("//input[@placeholder = 'Enter your name']")).sendKeys(name);
	
	driver.findElement(By.xpath("//input[@placeholder = 'Enter email address']")).sendKeys(emailId);
	
	
	driver.findElement(By.xpath("//button[text()='Next']")).click();*/
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[text()='Hi " + name+ "']")).isDisplayed();
	
	
	driver.quit();
	
	
	}
	
	
	

}
