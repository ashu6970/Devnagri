package com.pages.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.product.Base_Test;

public class LoginPage extends Base_Test {
	
	//Page Factory model
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement txtbn_username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement txtbn_password;
	
	@FindBy(xpath="//form[@id='loginform']/div[4]")
	WebElement btn_login;
	
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
		
	}

}
