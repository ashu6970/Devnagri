package com.pages.product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.product.Base_Test;

public class LoginPage extends Base_Test {
	
	//Page Factory model
	
	@FindBy(xpath="//form[@id='loginform']/div[1]/div[1]/input[1]")    // Enter the email id
	WebElement txtbn_username;
	
	@FindBy(xpath="//form[@id='loginform']/div[2]/div[1]/input[1]") //Enter the email password
	WebElement txtbn_password;
	
	@FindBy(xpath="//form[@id='loginform']/div[4]") // To Select the login button
	WebElement btn_login;
	
	@FindBy(xpath=".//*[@id='start-project-card']/div/div/a[1]")
	WebElement valid;
	
	@FindBy(xpath="//form[@id='loginform']/div[1]/div[1]/span[1]/strong[1]")
	WebElement credentialMatch_negative;
		
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
    	 waitForPageLoaded();
    	
    	 return valid.getText();
    	
    }
    public void clearEditBox()
    {
    	txtbn_username.clear();
    	txtbn_password.clear();
    	 	
    }

}
