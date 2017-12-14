package com.pages.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.main.product.Base_Test;

public class CreateProject extends Base_Test{
	
	
	@FindBy(xpath="//div[@class='text-center']/child::a[1]")
	WebElement btn_startNewProject;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[1]/div[1]/input[1]")
	WebElement txtbn_projectName;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement btn_projectType;
	
	public CreateProject()
	{
		PageFactory.initElements(driver, this);
	}

  public void startNewProject(String projectName)
  {
	  btn_startNewProject.sendKeys(projectName);
	
  }
  
  public void selectProjectType()
  {
	  
	 WebElement element = driver.findElement(By.xpath("//form[@id='addProjectForm']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));
	  
	 Select dropdown = new Select(element);
	   dropdown.selectByVisibleText("Website");
	  
  }
	
}


