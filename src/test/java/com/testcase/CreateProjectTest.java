package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.product.Base_Test;
import com.pages.product.CreateProject;

public class CreateProjectTest extends Base_Test {

	public CreateProject createproject;

	@Test(priority = 0)
	public void startProject() {
		try {
			createproject = new CreateProject();
			createproject.startNewProject();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "http://staging.devnagri.com/projects/start");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Leave all the fields blank and submit Tap on the start button without select any option
	
		@Test(priority = 1, groups = "Negative")
	public void withOutSelectAllOptions() {
		createproject.clickOnLetsStartbutton();
		WebElement login_txt = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ul/li"));
		String txt = login_txt.getText();
		Assert.assertEquals(txt, "The name field is required.");
		System.out.println(txt);

	}
	// Leave language field blank & fill all other mandatory fields then submit
	@Test(priority = 2, groups = "Negative")
	public void onlyEnterProjectName() throws InterruptedException
	{
		createproject.enterProjectName("Negative Test");
		Thread.sleep(2000);
		createproject.clickOnLetsStartbutton();
		WebElement Element= driver.findElement(By.xpath("//div[@class='alert alert-danger']/ul/li"));
		String txt = Element.getText();
		Assert.assertEquals(txt, "The languages field is required.");
	}
	
	// Leave project name blank and fill all other mandatory fields then submit 
	@Test(priority = 3, groups = "Negative")
	public void onlySelectTargetLanguage() throws InterruptedException
	{
		createproject.clearEditBox();
		createproject.selectTargetLanguage();
		createproject.clickOnLetsStartbutton();
		WebElement Element = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ul/li"));
		String txt = Element.getText();
		Assert.assertEquals(txt, "The name field is required.");
	}
	
	@Test(priority = 4)
	public void typeProjectName() {
		try {
			createproject.enterProjectName("বাংলা");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void projectType() {
		createproject.selectProjectType();

	}

	@Test(priority = 6)
	public void industryType() {
		createproject.selectIndustry();

	}

	@Test(priority = 7)
	public void targetLanguage() {
		createproject.selectTargetLanguage();
	}

	@Test(priority = 8)
	public void doClickOnLetsStartButton() throws InterruptedException {
		createproject.clickOnLetsStartbutton();
		pageScrolldown();
		String text = createproject.validateCreateProject();
		Assert.assertEquals(text, "Add New File");
		Thread.sleep(1000);
		System.out.println(text);
	}

}
