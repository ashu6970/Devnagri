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
	

}