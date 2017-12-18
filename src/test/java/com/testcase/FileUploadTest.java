package com.testcase;

import org.testng.annotations.Test;


import com.pages.product.FileUpload;

public class FileUploadTest {
	
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

}
