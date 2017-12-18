package com.pages.product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.main.product.Base_Test;

public class CreateProject extends Base_Test{
	
	
	//div[@class='text-center']/child::a[1]
	
	@FindBy(xpath=".//*[@id='start-project-card']/div/div/a[1]")
	 WebElement btn_startNewProject;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[1]/div[1]/input[1]")
	  WebElement txtbn_projectName;
	
	@FindBy(xpath="//div[contains(@class,'row p-t-20')]/child::div[1]/div[1]/div/button")
	 WebElement btn_projectType;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/ul/li[2]/a/span[1]")
	 WebElement btn_website;
	
	public CreateProject()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void startNewProject()
	{
		btn_startNewProject.click();
	}

  public void enterProjectName(String projectName)
  {
	  txtbn_projectName.sendKeys(projectName);
	
  }
  
  public void selectProjectType()
  {
	  
	  btn_projectType.click();  
	  btn_website.click();
  }
	
}


