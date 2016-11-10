package com.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.logging.Logging;

public class WebGeneric {
	public static WebDriver driver;
	public static WebDriver driverSet(String Browser){
		switch (Browser) {
		case "firefox":
			driver=new FirefoxDriver();
			Logging.genReport(Browser+"Browser is lanched");
			return driver;
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QEdge\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
			driver=new ChromeDriver();
			Logging.genReport(Browser+"Browser is lanched");
			return driver;	
		
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:/Users/QEdge/Downloads/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
			Logging.genReport(Browser+"Browser is lanched");
			return driver;
		default:
			return null;
		}
		
	}
	/*
	 * This method is used to read the date
	 * no parameters
	 * return type is string
	 */
	public static String date(){
    	Date date=new Date();
    	 SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");  
    	 String strDate= formatter.format(date);  
    	 System.out.println(strDate);
    	 return strDate;
    }
	
	public static  void screenshot(String ScreenshotName) throws IOException{
			
	    	String d=date();
	    	String d1=d.replaceAll("\\W", "");
			//To take screenshot
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile=new File("./Screenshot/"+ScreenshotName+d1+".jpeg");
			FileUtils.copyFile(srcFile, destFile, true);	
		}
	public static void main(String[] args) throws IOException {
		/*String d1=date();
		System.out.println(d1);*/
		driver=new FirefoxDriver();
		Logging.genReport("Browser launched");
		driver.get("http://demo.actitime.com");
		Logging.genReport("Url passed");
		screenshot("Browser");
		
		
	}
	/* Method is used for finding locator
	 * parameters are keyValue from element.properties
	 * return type is String
	 */
	public static String locator(String keyValue) throws IOException{
		FileInputStream fis=new FileInputStream("element.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String keyValues=pro.getProperty(keyValue);
		String keyValuesArray[]=keyValues.split(":");
		String locator=keyValuesArray[0];
		return locator;
	}
	/* Method is used for finding locatorValue
	 * parameters are keyValue from element.properties
	 * return type is String
	 */
	public static String locatorValue(String keyValue) throws IOException{
		FileInputStream fis=new FileInputStream("element.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String keyValues=pro.getProperty(keyValue);
		String keyValuesArray[]=keyValues.split(":");
		String locatorValue=keyValuesArray[1];
		return locatorValue;
	}
	
	/*public static WebElement elementLocator(String locator,String locValue){
		switch (locator) {
		case "id":
			System.out.println("id is retrieved");
			return driver.findElement(By.id(locValue));
		case "name":
			return driver.findElement(By.name(locValue));
		case "linktext":
			return driver.findElement(By.linkText(locValue));
		default:
			return null;
		}
	}*/
	public static WebElement elementlocator(String locator, String locvalue) throws IOException {
        switch (locator) {
            case "id":{
            	try {
            		return driver.findElement(By.id(locvalue));
            		
				} catch (NoSuchElementException e) {
					
					Logging.genReport("Locator not found " +locator);
					screenshot("Locatornotfound"+locator);
				}
                }
            
            case "name":{
            	try {
            		return driver.findElement(By.name(locvalue));
				} catch (NoSuchElementException e) {
					 Logging.genReport("Locator not found " +locator);
					 screenshot("Locatornotfound"+locator);
				}
                }
                
            case "linktext":{
            	
            	try {
            		return driver.findElement(By.linkText(locvalue));
            		
				} catch (NoSuchElementException e) {
					Logging.genReport("Locator not found " +locator);
					screenshot("Locatornotfound"+locator);
				}
                }
            	   
            case "xpath":{
                return driver.findElement(By.xpath(locvalue));}
            case "cssselector":{
                return driver.findElement(By.cssSelector(locvalue));}
            default:
                return null;
        }
    }
    
    public static void performAction(String locator, String locvalue,String WebAction,  String Value) throws IOException {
        WebElement Element=elementlocator(locator, locvalue);
        switch (WebAction) {
            case "click":
            	try {
            		 Element.click();
                     	System.out.println("performed action on " +WebAction);
                        Logging.genReport("performed action  " +WebAction);
				} catch (Exception e) {
					// genReport("Not performed action on " +WebAction, "info");
				}
               
                break;
            case "sendkeys":
                Element.sendKeys(Value);
                  System.out.println("enter data " +Value);
                 Logging.genReport("enter data " +Value);
                break;
            case "select":
            	Select sek=new Select(Element);
            	sek.selectByVisibleText(Value);
                System.out.println("select data " +Value);
                Logging.genReport("select data" + Value);
                break;
            default:
                System.out.println("Element not Found");
   
        }
}
	
}
