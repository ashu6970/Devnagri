package com.pages.product;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.main.product.Base_Test;

public class MakeOrder extends Base_Test{
	
	 // Click on make an order button
	@FindBy(xpath="//div[@class='container-fluid']/child::h4[3]/a[1]")   
	 WebElement btn_makeAnOrder;
	
	//  Please Select Translation option
	@FindBy(xpath="//div[@class='form-group row content-margin']/div/select[1]")    
	 WebElement btn_selectTranslationOption;
	
	// Select Target Language
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick fileList']/button[1]")    
	 WebElement btn_selectTragetLanguage;
	
	// Choose the Target language from drop down options
	@FindBy(xpath="//div[@class='btn-group bootstrap-select show-tick fileList show']/div[1]/ul[1]/li[1]/a[1]/span[1]")    
	 WebElement btn_selectTargetLanuageFromDropdown;
	
	// Choose the select all options
	@FindBy(xpath="//input[@id='select-all-text-input']")    
	 WebElement btn_selectAll;
	
	// Choose the select file options
	@FindBy(xpath="//input[@id='added-after-text-input']")    
	 WebElement btn_selectFiles;
	
	// Choose the select files from drop down options
	@FindBy(xpath="//div[@class='col-7']/div[1]")    
	 WebElement btn_selectFilesDropdown;
	
	// Click on submit button
	@FindBy(xpath="//div[@class='col-6 offset-4']/div[1]/input[1]")    
	 WebElement btn_submit;
	
	// click for place order
	@FindBy(xpath="html/body/div[2]/div[2]/div/div[2]/div/div[5]/div/a")    
	 WebElement btn_placeOrderNow;
	
	// For Validation
	
	@FindBy(xpath="//i[@class='mdi mdi-chevron-double-left']//ancestor::a")    
	 WebElement valid;
	
	
	public MakeOrder()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void makeAnOrder()
	{
		try
		{
		Thread.sleep(3000);
		btn_makeAnOrder.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void selectAll()
	{
		try
		{
		Thread.sleep(2000);
		btn_selectAll.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void selectFiles()  
	{
		try
		{
		btn_selectFiles.click();
		btn_selectFilesDropdown.click();
		Thread.sleep(3000);
		//btn_selectFilesFromDropdown.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	public void targetLanguage()
	
	{
		try
		{
		Thread.sleep(2000);
		btn_selectTragetLanguage.click();
		Thread.sleep(2000);
		btn_selectTargetLanuageFromDropdown.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void submit()
	{
		try
		{
			 WebElement element1= driver.findElement(By.xpath("//div[@class='col-6 offset-4']/div[1]/input[1]")); 
			  JavascriptExecutor executor1 = (JavascriptExecutor)driver; 
			  executor1.executeScript("arguments[0].click()", element1);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void placeAnOrder()
	{
		try
		{
		Thread.sleep(4000);
		btn_placeOrderNow.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	 public String Validate()
	    {
	    	 waitForPageLoaded();
	    	 return valid.getText();
	    }
}
