package com.cjc.dws.webapp.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.dws.webapp.utility.Common1;

public class LoginPage {
	
	 WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	
    @FindBy(css ="#Email")
    WebElement email;

    @FindBy(css="#Password")
    WebElement password;

    @FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input")
    WebElement login;

   
    public void loginCheck() throws IOException
    {
    	 driver.get("http://demowebshop.tricentis.com/login");
    	 FileInputStream fis=new FileInputStream("D:\\Selenium\\DemoWebShopHybridFrameWork\\src\\test\\resources\\DWS.properties");
    	 Common1.pro.load(fis);
    	 
    	 email.sendKeys(Common1.pro.getProperty("un1"));
    	 password.sendKeys(Common1.pro.getProperty("ps1"));
    	 login.click();
    }
    
    
}
