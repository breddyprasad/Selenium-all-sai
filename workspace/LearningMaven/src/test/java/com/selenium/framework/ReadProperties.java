package com.selenium.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
		static WebDriver driver;
		public static String eleproperty(String keyvaluepair) throws IOException{
			FileInputStream fis=new FileInputStream("object.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String usernameproperty=pro.getProperty(keyvaluepair);
			String parts[]=usernameproperty.split(":");
			//String eleproperty=parts[0];
			String propertyvalue=parts[1];
			return propertyvalue;
		}
	
	public static void main(String[] args) throws IOException {
		
		//For Reading the properties
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id(eleproperty("login.username"))).sendKeys("admin");
		driver.findElement(By.name(eleproperty("login.password"))).sendKeys("manager");
		driver.findElement(By.linkText(eleproperty("login.login"))).click();
		
		
	}
	
}
