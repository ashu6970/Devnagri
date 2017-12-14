package com.main.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Test {
	
	public static WebDriver driver;
    public static Properties prop;
    public static File file;
    
    //Read the property file
    public static void readPropertyFile()
    {
    
    try {
        file = new File(System.getProperty("user.dir") + "/src/resource/java/config.prop");
        FileInputStream file_read = new FileInputStream(file); 
        prop = new Properties();
        prop.load(file_read);
    
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } 
    catch (IOException e) {
        e.printStackTrace();
    }
}
   public static void initializeBrowser()
   {
	  // String browserName = prop.getProperty("browser");
		
	   if (driver == null)
	   {
		   driver = new ChromeDriver(); 
		  
	  // if(browserName.equals("chrome")){
		//	driver = new ChromeDriver(); 
		}
		/*else if(browserName.equals("FF")){
			driver = new FirefoxDriver(); 
		}
		else
		{
			System.out.println("Browser is not open");
			}
			*/
	   driver.get(prop.getProperty("url"));
	   }
   
   public static void click()
   {
	   
	   
	   
   }
   

   
 
   }
    
    


