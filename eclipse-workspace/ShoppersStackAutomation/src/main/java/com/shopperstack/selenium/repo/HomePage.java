package com.shopperstack.selenium.repo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver ;
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//div[@class='menu_catMenu__KGwfB']/div[@class='menu_menuBlock__ZZYMo']/nav/ul/li")
	 private List<WebElement> menubar;

	 @FindBy(xpath = "//a[@href='/sub-category/men-shirt']")
	 private WebElement shirt;
	
	 @FindBy(xpath = "//a[@href='/sub-category/men-shirt']")
	 private WebElement roadster;
	 
	 public List<WebElement> getmenubar() {
		 return menubar;
	 }
	 
	 public WebElement getMenShirtSection() {
		 return shirt;
	 }
	 
	 public WebElement getRoadsterShirt() {
		 return roadster;
	 }
	 
}  
