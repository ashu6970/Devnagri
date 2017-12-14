package com.testcase;

import org.testng.annotations.Test;

import com.main.product.Base_Test;
import com.pages.product.CreateProject;

public class CreateProjectTest extends Base_Test {
	
	public CreateProject createproject;
	
	@Test(priority=1)
	public void typeProjectName()
	{
		createproject=new CreateProject();
		createproject.startNewProject("New Project created");
		
	}
	
	@Test(priority=2)
	public void projectType()
	{
	
     createproject.selectProjectType();
     
	
	}
	

}
