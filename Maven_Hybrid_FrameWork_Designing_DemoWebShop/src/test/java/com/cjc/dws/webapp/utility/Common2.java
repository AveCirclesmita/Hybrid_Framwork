package com.cjc.dws.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common2 
{
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String firstName;
	public static String lastName;
	public static String email;
	public static String password;
	public static String cpassword;
	
	public static Properties pro=new Properties();

	
	public static FileInputStream finecall() throws FileNotFoundException
	{
		fis=new FileInputStream("D:\\Selenium\\DemoWebShopHybridFrameWork\\src\\test\\resources\\HybridDWS.xlsx");
		return fis;
	}
	static List<String>l=new ArrayList<String>();
	public static void registerData() throws IOException
	{
		fis=new FileInputStream("C:\\Users\\Shree\\Desktop\\Demo.xlsx");
        wb=new XSSFWorkbook(fis);
        sheet=wb.getSheet("Sheet1");
        Object data [][]=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
       // System.out.println(sheet.getLastRowNum()+" "+sheet.getRow(0).getLastCellNum());
        int rowCount=sheet.getLastRowNum();
        
        for(int i=0;i<sheet.getLastRowNum();i++)
        {
        	for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
        	{
        		data[i][j]=sheet.getRow(i+1).getCell(j).toString();
        		
        				System.out.println(data[i][j]);
            }
        	
//        	firstName=l.get(0);
//        	lastName=l.get(1);
//        	email=l.get(2);
//        	password=l.get(3);
//        	cpassword=l.get(4);
        		
        }
	
	}
	
	public static void main(String[] args) throws IOException {
		registerData();
	}
	
	

}
