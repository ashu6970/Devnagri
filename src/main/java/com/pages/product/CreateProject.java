package com.pages.product;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/ul/li[2]/a/span[1]")    // To select the website
	 WebElement btn_website;
	
	@FindBy(xpath=".//*[@id='addProjectForm']/div/div[2]/div[2]/div/div/div/ul/li[2]/a/span[1]") //To select the Agriculture
	 WebElement btn_agriculture;
	
	@FindBy(xpath=".//*[@id='addProjectForm']/div/div[4]/div[2]/div/div/div/ul/li[9]/a/span[1]")    // To select the English
	 WebElement btn_english;

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
	  WebElement element = driver.findElement(By.xpath("//div[contains(@class,'row p-t-20')]/child::div[1]/div[1]/div/button")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	   
	  btn_website.click();
  }
  
  public void selectIndustry()
  {
	  WebElement element = driver.findElement(By.xpath("//div[contains(@class,'row p-t-20')]/child::div[2]/div/div/button[1]")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	  
	  btn_agriculture.click();
	 
	 
	/* WebElement drop=driver.findElement(By.xpath("//div[contains(@class,'row p-t-20')]/child::div[2]/div/div/button[1]"));
	 Select dropdown=new Select(drop);
	 dropdown.selectByVisibleText("Agriculture");
	 */
  }
  
  public void selectTargetLanguage()
  {
	  WebElement element = driver.findElement(By.xpath(".//*[@id='addProjectForm']/div/div[4]/div[2]/div/div/button")); 
	  JavascriptExecutor executor = (JavascriptExecutor)driver; 
	  executor.executeScript("arguments[0].click()", element);
	  
	  
	  
	  
  }
	
}


