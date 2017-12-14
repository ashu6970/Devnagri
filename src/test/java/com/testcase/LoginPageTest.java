package com.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.product.Base_Test;
import com.pages.product.LoginPage;

public class LoginPageTest extends Base_Test{
	
	 public LoginPage loginpage;
	
	@Test(priority=1)
	public void openBrowser()
	{
		readPropertyFile();
		initializeBrowser();
		
		loginpage = new LoginPage();
		   
	}
	@Test(priority=1)
	public void doLogin()
	{
		
	}
    
}


