package handlingtabledivisions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDivision {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.myntra.com/");
	 WebElement menuDivTag = driver.findElement(By.className("desktop-navLinks"));
	 //limited search area in DOM
	 //Optimized Search criteria
	 //search element  inside another element
	 //search elements inside another element
		List<WebElement> allNavMenuOptions = menuDivTag.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		for (WebElement navOption : allNavMenuOptions) {
			String option = navOption.getText();
			System.out.println(option);
		}
		driver.manage().window().minimize();
		driver.quit();
}
}
