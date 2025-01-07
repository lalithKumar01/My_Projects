package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrepareForScreenShot {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/");
	Actions actions = new Actions(driver);
	WebElement menSection = driver.findElement(By.linkText("MEN"));
	WebElement refEle = driver.findElement(By.xpath("//li[@data-test='li-MEN']"));
	WebElement categories = refEle.findElement(By.xpath("//ul[@class='menu-lfirst']//li/a[text()='CATEGORIES']"));
	WebElement brands = refEle.findElement(By.xpath("//ul[@class='menu-lfirst']//li/a[text()='BRANDS']"));
	actions.moveToElement(menSection).perform();
	for(;;) {
		actions.moveToElement(categories).moveToElement(brands).build().perform();
	}
	
	
}
}
