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
	public void startproject() {
		try {
			createproject = new CreateProject();
			createproject.startNewProject();
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "http://dev.devnagri.co.in/projects/start");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void typeProjectName() {
		try {
			createproject.enterProjectName("New Project created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void projectType() {
		createproject.selectProjectType();

	}

	@Test(priority = 4)
	public void industryType() {
		createproject.selectIndustry();

	}

	@Test(priority = 5)
	public void targetLanguage() {
		createproject.selectTargetLanguage();
	}

	@Test(priority = 6)
	public void doClickOnLetsStartButton() throws InterruptedException {
		createproject.clickOnLetsStartbutton();
		pageScrolldown();
		String text = createproject.validateCreateProject();
		Assert.assertEquals(text, "Add New File");
		Thread.sleep(1000);
		System.out.println(text);
	}

	@Test(priority = 1, groups = "Negative")
	public void withOutSelectAllOptions() {
		createproject.clickOnLetsStartbutton();
		WebElement login_txt = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ul/li"));
		String txt = login_txt.getText();
		// Assert.assertEquals(txt, arg1);
		System.out.println(txt);

	}

}
