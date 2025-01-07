package handlingtabledivisions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DealWithTable {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://money.rediff.com/gainers");
	 //driver ref we are identifying the table
	 WebElement companyTable = driver.findElement(By.className("dataTable"));
	 //optimized Search Criteria
	 List<WebElement> companyName = companyTable.findElements(By.xpath("//tbody//td/a"));
	 System.out.println(companyName.size());
	 for (WebElement company : companyName) {
		String companyPrint = company.getText();
		System.out.println(companyPrint);
	}
	 driver.manage().window().minimize();
	 driver.quit();
}
}
