package com.hdfc.loans.carloans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest 

{
	
	public static String datapath="./data.properties";
	//public static String datapath=System.getProperty("user.dir")+"//data.properties";
	
	public static Properties dataload=null;
	
	public static WebDriver driver;
	
	public static void init() throws Exception
	{
		FileInputStream fis=new FileInputStream(datapath);
		
		dataload= new Properties();
		
		dataload.load(fis);
		
		System.out.println("file got loaded....");
			
	}
	
	public static void launch(String browser)
	{
		if(dataload.get(browser).equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if (dataload.get(browser).equals("firefox"))
		
		{
			driver= new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		
		}
		else 
			System.out.println("Given browser is not mathched...");
		}
		
	

	public static void navigate(String url)
	
	{
		driver.get(dataload.getProperty(url));
		
	}

}
