package com.cjcwebapp.Magento.page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjcwebapp.Magento.Utility.CommonUtility;



public class RegistrationPage 
{
	WebDriver driver;

	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(css="#firstname")
	WebElement frist_name;
	
	@FindBy(css="#lastname")
	WebElement Last_name;
	
	@FindBy(css="#email_address")
	WebElement email;
	
	@FindBy(xpath ="//*[@id='password']")
	WebElement password;
	
	@FindBy(css="#password-confirmation")
	WebElement C_password;
	
	@CacheLookup
	@FindBy(css="[class='action submit primary']")
	WebElement Reg_buyton;
	
	
	public void registerCheck() throws IOException, InterruptedException
	{
		CommonUtility.registerData();
	   String fn=CommonUtility.firstName;
	   String ln=CommonUtility.lastName;
	   String em=CommonUtility.email;
	   String ps=CommonUtility.password;
	   String cp=CommonUtility.cpassword;
	   
	   frist_name.sendKeys(fn);
	   Last_name.sendKeys(ln);
	   email.sendKeys(em);
	   password.sendKeys(ps);
	   C_password.sendKeys(cp);
	   //Thread.sleep(1000);
	   Reg_buyton.click();
	   
	   
	   
	}
}
