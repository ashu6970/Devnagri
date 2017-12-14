package com.pages.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProject {
	
	
	@FindBy(xpath="//div[@class='text-center']/child::a[1]")
	WebElement btn_startNewProject;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[1]/div[1]/input[1]")
	WebElement txtbn_projectName;
	
	@FindBy(xpath="//form[@id='addProjectForm']/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement btn_projectType;
	
}

//from[@id='addProjectForm']/following::div
