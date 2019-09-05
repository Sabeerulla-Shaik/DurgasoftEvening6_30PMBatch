package com.selenium.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationLoginPage 
{
	
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement customerEmail;
	@FindBy(id="passwd")public WebElement customerPassword;
	@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement loginError;
	
	public AutomationLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		signIn.click();	
		customerEmail.sendKeys("qatest84754857@gmail.com");
		customerPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public  String verifyError()
	{
		String actualtext = loginError.getText();
		return actualtext;
	}
	
	

}
