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
	 
	 @FindBy(xpath = "//a[normalize-space()='Topwear']")
	 private WebElement topwear;
	 
	 //add to cart

	 @FindBy(xpath = "//a[@href='/sub-category/men-shirt']")
	 private WebElement shirt;
	
	 @FindBy(xpath = "//div[@id='root']/div/div/div[@class='cat_box__jl5G7']/div[1]")
	 private WebElement roadster;
	 
	 @FindBy(xpath = "///button[@id='Add To Cart']")
	 private WebElement addtocartbutton;
	 
	 @FindBy(xpath = "//a[@id='cart']//*[name()='svg']")
	 private WebElement opencart;
	 
	 @FindBy(xpath = "//div[@class='cart_productDetails__Glgfl']")
	 private WebElement addedRoadsterShirt;
	 
	 public List<WebElement> getmenubar() {
		 return menubar;
	 }
	 
	 public WebElement getTopwere() {
		 return topwear;
	 }
	 
	//add to cart
	 
	 public WebElement getMenShirtSection() {
		 return shirt;
	 }
	 
	 public WebElement getRoadsterShirt() {
		 return roadster;
	 }
	 
	 public WebElement getAddToCartButton() {
		 return addtocartbutton;
	 }
	 
	 public WebElement getCartPage() {
		 return opencart;
	 }
	 
	 public WebElement getAddedRoadsterAhirt() {
		 return addedRoadsterShirt;
	 }
	 
}  
