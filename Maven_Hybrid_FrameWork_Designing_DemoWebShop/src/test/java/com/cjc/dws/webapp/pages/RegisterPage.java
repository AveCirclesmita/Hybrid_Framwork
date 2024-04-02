package com.cjc.dws.webapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.dws.webapp.utility.Common1;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver)
	{
		super();
		this.driver = driver;
	}

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a")
	WebElement register;

	@FindBy(css="#gender-male")
	WebElement gender;

	@FindBy(css="#FirstName")
	static WebElement fName;

	@FindBy(css="#LastName")
	WebElement lName;

	@FindBy(css="#Email")
	WebElement mail;

	@FindBy(css="#Password")
	WebElement pass;

	@FindBy(css="#ConfirmPassword")
	WebElement cpass;

	@FindBy(css="#register-button")
	WebElement rgbutton;

	
	public void registerCheck() throws IOException
	{
		Common1.registerData();
	   String fn=Common1.firstName;
	   String ln=Common1.lastName;
	   String em=Common1.email;
	   String ps=Common1.password;
	   String cp=Common1.cpassword;
	   
	   register.click();
	   gender.click();
	   fName.sendKeys(fn);
	   lName.sendKeys(ln);
	   mail.sendKeys(em);
	   pass.sendKeys(ps);
	   cpass.sendKeys(cp);
	   rgbutton.click();
	   
	   
	   
	}
	
	
	
}
