package com.testcase;

import org.testng.annotations.Test;

import com.pages.product.MakeOrder;

public class MakeOrderTest {
	public MakeOrder makeorder;
	
	@Test(priority=1)
	public void clickOnMakeOrder()
	{
		makeorder=new MakeOrder();
		makeorder.makeAnOrder();
	}
	 
	@Test(priority=2)
	public void clickOnSelectAll()
	{
		
		makeorder.selectAll();
		
		
	}
	
	@Test(priority=3)
	
	public void clickOnSubmit()
	{
		makeorder.submit();
	}
	

}
