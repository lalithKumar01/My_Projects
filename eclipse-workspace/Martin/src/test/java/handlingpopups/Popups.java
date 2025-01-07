package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.trello.qspiders.genericutility.BaseClass;

public class Popups extends BaseClass {

	@Test
	public void hiddenDivisionPopup() throws Throwable {
		webdriverUtils.implicitWait(driver);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);
		// Hidden division popup is made with <div>\
		// it is ispectable
		// selenium has solution to handle this popup findElement().
		// it is not dragabble
		// it is not blocking the end user.
	}

	@Test
	public void notificationPopup() {
		//handle HDD
		//refer the base class for the configuration of the popup
		// it is browser level popup
		// it acts like a obscured element
		//it is not draggabble
		//it is not blocking popup
		//Selenium has solution to handle this popup.
	}
	@Test
	public void alertConfirmation() throws Throwable {
		//get the alert message and check 
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		// handle the alert popup
		driver.switchTo().alert().accept();
		//identify Min. Of Defense
		WebElement defense = driver.findElement(By.xpath("//a[text()='Ministry of Defence']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(defense).pause(2000).perform();
		defense.click();
		Thread.sleep(2000);
		//capture the confirmation message
		String confiramtionMessage = driver.switchTo().alert().getText();
		System.out.println(confiramtionMessage);
		//handle the confirmation popup by clicking cancel option
		//driver.switchTo().alert().dismiss();
		//handle the confirmation popup by clicking ok option
		driver.switchTo().alert().accept();
		//Alert
		//> It is blocking  popup
		//> it is not dragabble
		//> it can Be handled through selenium library
		//> it is having ok button alone.
		//it is not inspectable
		//Confiramtion
		//> It is blocking  popup
				//> it is not dragabble
				//> it can Be handled through selenium library 
		//> it has both ok and cancel buttons.
		//it is not inspectable
	}
	
	@Test
	public void promptPopup() {
		//get the prompt question
		String promptQuestion = driver.switchTo().alert().getText();
		System.out.println(promptQuestion);
		//pass the data to the popup
		driver.switchTo().alert().sendKeys("123456789");
		//click on ok and handle it
		driver.switchTo().alert().accept();
		//> It is blocking  popup
		//> it is not dragabble
		//> it can Be handled through selenium library 
		//> it has both ok and cancel buttons.
		//> it has a text field to pass the data.
		//it is not inspectable
	}
	@Test
	public void fileDownLoadPopup() throws Throwable {
		//identify the 4.8.3
		webdriverUtils.implicitWait(driver);
		driver.findElement(By.linkText("4.8.3")).click();
		driver.get("chrome://downloads/");
		SearchContext shadowHost = driver.findElement(By.tagName("downloads-manager")).getShadowRoot();
		SearchContext shadowHost2 = shadowHost.findElement(By.cssSelector("downloads-item[id='frb0']")).getShadowRoot();
		shadowHost2.findElement(By.cssSelector("div[id='dangerous']")).findElement(By.cssSelector("cr-button[focus-type='save']")).click();
		//driver.switchTo().alert().accept();
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.ENTER).perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(300);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(300);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.navigate().back();	
	}
	@Test
	public void fileUploadPopup() {
		webdriverUtils.implicitWait(driver);
		WebElement fileUploadButton = driver.findElement(By.xpath("//input[@type='file']"));
		fileUploadButton.sendKeys("C:\\Users\\HP\\Desktop\\upload.pdf");
	}

}
