package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterDataTextField {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://demo.automationtesting.in/Frames.html");
	 WebElement parentFrame = driver.findElement(By.id("singleframe"));
	 //String h5tagText = driver.switchTo().frame("singleframe")
	//findElement() has no scope to getinside the <iframe> keeping driver as a ref directly
	 String h5tagText=driver.findElement(By.tagName("h5")).getText();
	 System.out.println(h5tagText);
	 driver.quit();
}
}
