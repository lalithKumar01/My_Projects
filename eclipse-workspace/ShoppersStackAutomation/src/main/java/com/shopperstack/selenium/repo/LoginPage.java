package com.shopperstack.selenium.repo;

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
	 @FindBy(xpath = "//button[@id='loginBtn']")
	 private WebElement loginButton;
	 @FindBy(xpath = "//input[@id='Email']")
	 private WebElement username;
	 @FindBy(xpath = "//input[@id='Password']")
	 private WebElement password;
	 @FindBy(xpath = "//button[@id='Login']")
	 private WebElement submit;
	 @FindBy(xpath = "//button[@aria-label='Account settings']")
	 private WebElement myprofile;
	 public WebElement getloginButton() {
		 return loginButton;
	 }
	 public WebElement getusernamefeild() {
		 return username;
	 }
	 public WebElement getpasswordfeild() {
		 return password;
	 }
	 public WebElement getSubmitLoginButton() {
		 return submit;
	 }
	 public WebElement getMyProfileButton() {
		 return myprofile;
	 }
}
