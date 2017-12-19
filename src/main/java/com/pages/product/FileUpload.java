package com.pages.product;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.product.Base_Test;

public class FileUpload extends Base_Test{
	
	@FindBy(xpath="//a[contains(text(),'Add New File')]")    // To upload the file
	 WebElement btn_addNewFile;
	
	@FindBy(xpath="//div[contains(@class,'modal-body step-1')]/div[1]")    
	 WebElement btn_dropNewFile;
	
	public FileUpload()
	{
     PageFactory.initElements(driver, this);
	}
	
	public void addNewFile() throws Exception
	{
		try
		{
		Thread.sleep(1000);
		btn_addNewFile.click();
		}
		
	catch(Exception e)
		{
		e.printStackTrace();
		throw(e);
		}
	}
	
	public void dropNewFile()
	{
		btn_dropNewFile.click();
	}
	
	public void FileLocation(String location)
	{
		try
		{
			Thread.sleep(1000);
			Actions act=new Actions(driver);
			act.moveToElement(btn_dropNewFile);
			act.click();
			act.sendKeys(location);
			act.build().perform();
		       
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
