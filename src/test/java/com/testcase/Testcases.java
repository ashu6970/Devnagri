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
		driver.get("http://dev.devnagri.co.in/");
		
		   
	}
	
    @Test(priority=1)
    public void doTheLogin()
    {
    	
    	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("client@fourtek.com");
    	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret");
    	driver.findElement(By.xpath("//form[@id='loginform']/div[4]")).click();
    	
    	
    }
}
