package com.hdfc.loans.carloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 

{

	public static void main(String[] args)
	
	{
		//System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.amazon.in/");
		
		//System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.flipkart.com/");
		
		
		
		
/*
		System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\iedriver.exe");
		WebDriver driver3=new InternertExplorerDriver();
		driver2.get("https://www.snapdeal.com/");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\User\\Desktop\\MicrosoftWebDriver.exe");
		WebDriver driver4=new MicrosoftWebDriver();
		driver3.get("https://www.bestbuy.com");*/

	}

}
