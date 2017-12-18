package com.pages.product;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.product.Base_Test;

public class LoginPage extends Base_Test {
	
	//Page Factory model
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement txtbn_username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement txtbn_password;
	
	@FindBy(xpath="//form[@id='loginform']/div[4]")
	WebElement btn_login;
	
	@FindBy(xpath="html/body/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/h4']")
	WebElement valid;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
		
	public void HomePagelogin(String user, String pwd)
	{
		txtbn_username.sendKeys(user);
		txtbn_password.sendKeys(pwd);
		btn_login.click();
		waitForPageLoaded();
		
	}
    public String Validate()
    {
    	 return valid.getText();
    	
    }

}
