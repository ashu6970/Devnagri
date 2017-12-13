package com.main.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base_Test {
	
	public static WebDriver driver;
    public static Properties prop;
    public static File file;
    
    //Read the property file
    public static void read_property_file()
    {
    try {
        file = new File(System.getProperty("user.dir") + "src/resource/java/com/resources/Config.prop");
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
   public static void open_browser()
   {
	   
   }
    
    
}


