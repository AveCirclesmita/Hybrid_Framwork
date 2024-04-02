package com.cjc.dws.webapp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdressPage 
{
	WebDriver driver;

	public AdressPage(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	@FindBy(css="#BillingNewAddress_Company")
	WebElement company;
	
	@FindBy(css="#BillingNewAddress_CountryId")
	WebElement country;
	
	@FindBy(css="#BillingNewAddress_City")
	WebElement city;
	
	@FindBy(css="#BillingNewAddress_Address1")
	WebElement ad1;
	
	@FindBy(css="#BillingNewAddress_Address2")
	WebElement ad2;
	
	@FindBy(css="#BillingNewAddress_ZipPostalCode")
	WebElement zip;
	
	@FindBy(css="#BillingNewAddress_PhoneNumber")
	WebElement pno;
	
	@FindBy(css="#BillingNewAddress_FaxNumber")
    WebElement fno;
	
	@FindBy(css="#billing-buttons-container > input")
	WebElement cnt1;
	
	@FindBy(css="#shipping-buttons-container > input")
	WebElement cnt2;
	
	@FindBy(css="#shippingoption_1")
	WebElement nda;
	
	@FindBy(css="#shipping-method-buttons-container > input")
	WebElement cnt3;
	
	
	
	
	public void adressCheck(String cm1,String ct,String ad,String add,String zp,String pn,String fn)
	{
		company.sendKeys(cm1);
		country.click();
		Select s=new Select(country);
		s.selectByIndex(9);
		city.sendKeys(ct);
		ad1.sendKeys(ad);
		ad2.sendKeys(add);
		zip.sendKeys(zp);
		pno.sendKeys(pn);
		fno.sendKeys(fn);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cnt1.click();
		cnt2.click();
		nda.click();
		cnt3.click();
		
		
		
		
		
		
		
	}
	
}
