package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropInTrello {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://trello.com/home");
		WebElement loginOption = driver
				.findElement(By.xpath("//a[text()='Get Trello for free']/preceding-sibling::a[text()='Log in']"));
		loginOption.click();
		driver.switchTo().activeElement().sendKeys("peoplefortiptur@gmail.com");
		WebElement loginToContinue = driver.findElement(By.id("login"));
		loginToContinue.submit();
		wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/login?"));
		driver.switchTo().activeElement().sendKeys("9886947924");
		// passwordTextField.sendKeys("9886947924");
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.submit();
		WebElement boardToClick = driver.findElement(By.xpath("//div[text()='ForPractice']"));
		boardToClick.click();
		Actions actions = new Actions(driver);
		WebElement srcEle = driver.findElement(By.xpath("//div[@class='list-card-details js-card-details' and contains(.,'WebDriver')]"));
		WebElement destEle = driver.findElement(By.xpath("//div[@class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable']/preceding-sibling::div[contains(.,'Doing')]"));
		actions.dragAndDrop(srcEle, destEle).perform();

	}
}
