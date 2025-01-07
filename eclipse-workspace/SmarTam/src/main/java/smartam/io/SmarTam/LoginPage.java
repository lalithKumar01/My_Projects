package smartam.io.SmarTam;

import org.openqa.selenium.WebElement;


import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    @AndroidFindBy(id ="  Login Now ")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }
}

