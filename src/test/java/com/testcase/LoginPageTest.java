package com.testcase;

import org.testng.Assert;
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
	@Test(priority=2)
	public void doLogin()
	{
		loginpage.HomePagelogin(prop.getProperty("username"),prop.getProperty("password"));
		waitForPageLoaded();
	//	String tittle = loginpage.Validate();
		//Assert.assertEquals(tittle, "Project created successfully! ");
		
	}
    
}


