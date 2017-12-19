package com.pages.product;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.main.product.Base_Test;

public class CreateProject extends Base_Test{
	
	
	//div[@class='text-center']/child::a[1]
	
	@FindBy(xpath=".//*[@id='start-project-card']/div/div/a[1]") // To the new project
	 WebElement btn_startNewProject;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[1]/div[1]/input[1]") // Enter the Project name
	  WebElement txtbn_projectName;
	
	@FindBy(xpath="//div[contains(@class,'row p-t-20')]/child::div[1]/div[1]/div/button") //To select the Project type
	 WebElement btn_projectType;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/ul/li[2]/a/span[1]")    // To select the website
	 WebElement btn_website;
	
	@FindBy(xpath=".//*[@id='addProjectForm']/div/div[2]/div[2]/div/div/div/ul/li[2]/a/span[1]") //To select the Agriculture
	 WebElement btn_agriculture;
	
	@FindBy(xpath=".//*[@id='addProjectForm']/div/div[4]/div[2]/div/div/div/ul/li[9]/a/span[1]")    // To select the English
	 WebElement btn_english;
	
	@FindBy(xpath="//div[@class='col-md-6 col-md-offset-3']/button[1]")    // click on Let's start button
	 WebElement btn_letsGetStart;
	
	@FindBy(xpath="//a[contains(text(),'Add New File')]")    // Validate Project is created
	 WebElement valid_createProject;
	
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
	 try
	 {
		 Thread.sleep(1000);
	  WebElement element = driver.findElement(By.xpath("//div[contains(@class,'row p-t-20')]/child::div[1]/div[1]/div/button")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	  btn_website.click();
	  }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
  }
  
  public void selectIndustry()
  {
	  try
	  {
		  Thread.sleep(1000);  
	  WebElement element = driver.findElement(By.xpath("//div[contains(@class,'row p-t-20')]/child::div[2]/div/div/button[1]")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	  btn_agriculture.click();
	  }
	  catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	
  }
  
  public void selectTargetLanguage()
  {
	  try{
	  WebElement element = driver.findElement(By.xpath(".//*[@id='addProjectForm']/div/div[4]/div[2]/div/div/button")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	  btn_english.click();
	  
	  WebElement element1= driver.findElement(By.xpath(".//*[@id='addProjectForm']/div/div[4]/div[2]/div/div/button")); 
	  JavascriptExecutor executor1 = (JavascriptExecutor)driver; 
	  executor1.executeScript("arguments[0].click()", element1);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	     
  }
  
  public void clickOnLetsStartbutton()
  {
	  WebElement element1= driver.findElement(By.xpath("//div[@class='col-md-6 col-md-offset-3']/button[1]")); 
	  JavascriptExecutor executor1 = (JavascriptExecutor)driver; 
	  executor1.executeScript("arguments[0].click()", element1);
  }
  
 public String validateCreateProject()
 {
	 return valid_createProject.getText();
 }
  
 /* public void JavaScriptClick(WebElement element) throws Exception 
  {
		try 
		{
			if (element.isEnabled() && element.isDisplayed())
			{
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} 
			else 
			{
				System.out.println("Unable to click on element");
			}
		}  
		 catch (Exception e) 
		{
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}

  }*/
  
}




