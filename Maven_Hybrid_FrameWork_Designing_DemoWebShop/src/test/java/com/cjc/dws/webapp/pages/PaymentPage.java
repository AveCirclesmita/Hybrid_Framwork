package com.cjc.dws.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(css="#payment-method-buttons-container > input")
	WebElement cnt4;
	
	@FindBy(css="#payment-info-buttons-container > input")
	WebElement cnt5;
	
	public void  paymentCheck()
	{
		cnt4.click();
		cnt5.click();
	}
	

}
