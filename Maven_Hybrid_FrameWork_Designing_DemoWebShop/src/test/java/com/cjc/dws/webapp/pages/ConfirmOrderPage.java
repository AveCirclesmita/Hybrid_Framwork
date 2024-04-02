package com.cjc.dws.webapp.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmOrderPage {
	WebDriver driver;
	public ConfirmOrderPage(WebDriver driver)
	{
		super();
		this.driver=driver;
        
	}
	
	@FindBy(css="#confirm-order-buttons-container > input")
	WebElement cnt6;
	
	public void confirmOrderCheck() throws IOException
	{

		cnt6.click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("src\\test\\resources\\SceenShot\\hybrid.jpg"));

		
	}

}
