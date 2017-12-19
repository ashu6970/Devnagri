package com.testcase;

import org.testng.annotations.Test;

import com.main.product.Base_Test;
import com.pages.product.FileUpload;

public class FileUploadTest extends Base_Test {
	
	public FileUpload fileload;
	
	@Test(priority=1)
	public void uploadTheFile()
	{
		try
		{
		fileload =new FileUpload();
		fileload.addNewFile();
		}
		catch(Exception e)
		{
			System.out.println("File is not uploaded" +e);
		}
		
	}
	
	/*@Test(priority=2)
	public void dropFileHereToUpload()
		{
		try 
		{
			Thread.sleep(1000);
			fileload.dropNewFile();
				
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		*/
	
	@Test(priority=2)
	public void enterFileLocation()
	{
		try
		{
		fileload.FileLocation(prop.getProperty("File_po"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

