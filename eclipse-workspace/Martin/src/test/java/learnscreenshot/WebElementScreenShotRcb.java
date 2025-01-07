package learnscreenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementScreenShotRcb {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.royalchallengers.com/");
		// identify RCB logo as a webelement
		WebElement rcbLogo = driver.findElement(By.xpath("//h4[text()='#Playbold']/..//img[contains(@src,'rcb-logo-new.png')]"));
		File tempFile = rcbLogo.getScreenshotAs(OutputType.FILE);
		//String fileAddressInMyPc = sshot.getAbsolutePath();
		//System.out.println(fileAddressInMyPc);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File destFile = new File("./src/test/errorshots/rcbLogo"+timeStamp+".png");
		//System.out.println(destFile.getAbsolutePath());
		FileUtils.copyFile(tempFile, destFile);
		
		
		
	}
}
