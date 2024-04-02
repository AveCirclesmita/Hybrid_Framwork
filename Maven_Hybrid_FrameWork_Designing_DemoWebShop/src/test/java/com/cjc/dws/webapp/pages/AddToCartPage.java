package com.cjc.dws.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {
	WebDriver driver;

	public AddToCartPage(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.header-menu > ul.top-menu > li:nth-child(1) > a")
	WebElement book;
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input")
	WebElement adc;
	
	@FindBy(css="#topcartlink > a > span.cart-label")
	WebElement scart;
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-body > div > form > table > tbody > tr > td.remove-from-cart > input[type=checkbox]")
	WebElement cbox;
	
	@FindBy(css="#termsofservice")
	WebElement termcbx;
	
	@FindBy(css="#checkout")
	WebElement checkOut;
	
	
	

	
	public void checkoutCheck()
	{
		
       book.click();
       adc.click();
       scart.click();
       cbox.click();
       termcbx.click();
       checkOut.click();
	}
	
	
	
	

}
