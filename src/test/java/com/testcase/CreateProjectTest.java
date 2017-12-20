package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.product.Base_Test;
import com.pages.product.CreateProject;

public class CreateProjectTest extends Base_Test {
	
	public CreateProject createproject;
	
	@Test(priority=0)
	public void startproject()
	{
		try
		{
			createproject=new CreateProject();
		    createproject.startNewProject();
		    String url = driver.getCurrentUrl();
			Assert.assertEquals(url,"http://dev.devnagri.co.in/projects/start");
	}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void typeProjectName()
	{
		try
		{
	      createproject.enterProjectName("New Project created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void projectType()
	{
	 createproject.selectProjectType();
	 
	}
	
	@Test(priority=3)
	public void industryType()
	{
		createproject.selectIndustry();
		
	}
	
	@Test(priority=4)
	public void targetLanguage()
	{
	createproject.selectTargetLanguage();
	}
	
	
	@Test(priority=5)
	public void doClickOnLetsStartButton() throws InterruptedException
	{
		createproject.clickOnLetsStartbutton();
		pageScrolldown();
		String text =createproject.validateCreateProject();
		Assert.assertEquals(text,"Add New File");
		Thread.sleep(1000);
		
		
	}

}
