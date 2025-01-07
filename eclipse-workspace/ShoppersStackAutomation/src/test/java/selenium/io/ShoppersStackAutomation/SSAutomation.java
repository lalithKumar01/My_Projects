package selenium.io.ShoppersStackAutomation;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shopperstack.selenium.repo.LoginPage;
import com.shopperstack.selenium.utlities.Configuration;

public class SSAutomation extends Configuration {
@Test(priority = 1)
public void logintoshopperstack() throws Exception {
	LoginPage login = new LoginPage(driver);
	driver.get(fileutils.getCredentialsFromProprities("url"));
	//WebElement logo = driver.findElement(By.xpath("//a[@id='home']"));
	wait.until(ExpectedConditions.visibilityOf(login.getloginButton()));
	login.getloginButton()
	.click();
	login.getusernamefeild().sendKeys(fileutils.getCredentialsFromProprities("username"));
	login.getpasswordfeild().sendKeys(fileutils.getCredentialsFromProprities("password"));
	login.getSubmitLoginButton().click();
	if(login.getMyProfileButton().isDisplayed()) {
		System.out.println("Successfully Login! ");
	}
	else
		System.out.println("Login Unsuccessful?");
}
}
