package selenium.io.ShoppersStackAutomation;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shopperstack.selenium.repo.HomePage;
import com.shopperstack.selenium.repo.LoginPage;
import com.shopperstack.selenium.utlities.Configuration;

public class SSAutomation extends Configuration {
	
	Actions actions ;
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

@Test(priority = 2)
public void getMenuList()  throws Exception {
	
	HomePage homepage = new HomePage(driver);
	
	List<WebElement> menus = homepage.getmenubar();
	
	List<String> menuText = new ArrayList<>(); ;
	
	for(WebElement menuItems : menus) {
		
		 menuText.add(menuItems.getText());
	}
	
	for(int i = 0 ; i< menuText.size() ;i++) {
		System.out.println(menuText.get(i));
	}
	 actions = new Actions(driver);
	actions.clickAndHold(menus.get(0)).perform();
	 if(homepage.getTopwere().isDisplayed()) {
		 System.out.println("Men Section is displayed");
	 }
	 else
		 System.out.println("Men Section is not found");
	
}
 
@Test(priority = 3)

public void addToCart() throws Exception {
	
	actions = new Actions(driver);
	HomePage homepage = new HomePage(driver);
	
	homepage.getMenShirtSection().click();
	
	Thread.sleep(5000);
	
	assert homepage.getRoadsterShirt().isDisplayed() : "Roadster shirt is not displayed";
	
    homepage.getAddToCartButton().click();
    
    homepage.getCartPage().click();
    
    if(homepage.getAddedRoadsterAhirt().isDisplayed()) {
    	
    	System.out.println("Added item is displayed");
    	
    }
    else 
    	
    	System.out.println("Added item is not displayed");
    
    
	
}

}
