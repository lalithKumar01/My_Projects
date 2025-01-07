package testAuto.io.DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver ;
 public LoginPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath = "//input[@name='username']")
 private WebElement username ;
 @FindBy(xpath = "//input[@type='submit']")
 private WebElement loginscreen ;
 @FindBy(xpath = "//input[@name='password']")
 private WebElement password ;
 public WebElement getUsernameFeild () {
	return username;
}
 public WebElement getlogincard () {
		return loginscreen ;
	}
 public WebElement getPasswordFeild () {
		return password ;
}
}
