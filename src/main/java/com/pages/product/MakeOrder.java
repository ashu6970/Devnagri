package com.pages.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.product.Base_Test;

public class MakeOrder extends Base_Test{
	
	@FindBy(xpath="//div[@class='container-fluid']/child::h4[3]/a[1]")    // Click on make an order button
	 WebElement btn_makeAnOrder;
	
	@FindBy(xpath="//input[@id='select-all-text-input']")    // Choose the select all options
	 WebElement btn_selectAll;
	
	@FindBy(xpath="//div[@class='col-12']")    // Click on submit button
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
	
	public void selectFile()
	{
		
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
