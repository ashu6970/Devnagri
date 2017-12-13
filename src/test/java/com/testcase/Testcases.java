package com.testcase;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.product.Base_Test;

public class Testcases extends Base_Test{
	
	@BeforeMethod
	public void openBrowser()
	{
		readPropertyFile();
		initializeBrowser();
		driver.get(System.getProperty("url")); 
		   
	}
	
    @Test(priority=1)
    public void doTheLogin()
    {
    	
    	driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
    	driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
    	driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
    	
    	
    }
}
