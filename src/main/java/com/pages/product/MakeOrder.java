package com.pages.product;
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
		btn_selectTragetLanguage.click();
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
		btn_submit.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
