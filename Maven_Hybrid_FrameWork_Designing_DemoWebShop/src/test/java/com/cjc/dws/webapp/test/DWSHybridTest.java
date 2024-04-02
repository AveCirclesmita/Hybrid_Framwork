package com.cjc.dws.webapp.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cjc.dws.webapp.pages.AddToCartPage;

import com.cjc.dws.webapp.pages.AdressPage;
import com.cjc.dws.webapp.pages.ConfirmOrderPage;
import com.cjc.dws.webapp.pages.LoginPage;
import com.cjc.dws.webapp.pages.PaymentPage;
import com.cjc.dws.webapp.pages.RegisterPage;
import com.cjc.dws.webapp.utility.Common1;

public class DWSHybridTest {
	WebDriver driver;
	//Properties pro=new Properties();
	@BeforeSuite(groups="demo")
    public void openBrowser() throws IOException
    {
		FileInputStream fis=new FileInputStream("src//test//resources//DWS.properties");
		Common1.pro.load(fis);
		System.setProperty(Common1.pro.getProperty("key"),Common1.pro.getProperty("value"));	
		driver=new ChromeDriver();
		
  }
	
	@Parameters({"url"})
	@BeforeTest
	public void openUrl(String url)
	{
		driver.get(url);
		
	}
	
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void page_lode()
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

   @Test(priority=0)
   public void registrationTest() throws IOException
   {
	   RegisterPage rp=PageFactory.initElements(driver,RegisterPage.class);
	   rp.registerCheck();
   }
   
   @Test(priority=1)
   public void loginTest() throws IOException
   {
	   LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
	   lp.loginCheck();
	   
   }
   
   @Test(priority=2)
     public void addToCartTest()
     {
	   AddToCartPage ap=PageFactory.initElements(driver, AddToCartPage.class);
	   ap.checkoutCheck();
     }

   @Test(priority=3,dataProvider = "getData")
   public void adressTest(String cm1,String ct1,String ad1,String ad2,String zp1,String pn,String fn)
	{
		AdressPage a=PageFactory.initElements(driver, AdressPage.class);
		a.adressCheck(cm1,ct1,ad1,ad2,zp1,pn,fn);		
	}
   
   @Test(priority=4)
   public void paymentTest()
   {
	   PaymentPage pp=PageFactory.initElements(driver,PaymentPage.class);
	   pp.paymentCheck();
   }
   
   @Test(priority=5)
   public void ConfirmOrderTest() throws IOException
   {
	   ConfirmOrderPage cp=PageFactory.initElements(driver,ConfirmOrderPage.class);
	   cp.confirmOrderCheck();
   }
   @DataProvider
   public Object[][] getData()
   {
	   return new Object[][]
			   {
		   new Object[] {"Cjc","Pune","Yashodeep Chauk","karve Nagar","443001","9784848484","85748"}
				};
			   }
   }

