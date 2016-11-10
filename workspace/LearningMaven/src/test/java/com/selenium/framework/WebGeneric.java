package com.selenium.framework;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;



public class WebGeneric {
	
	    private static WebDriver driver;
	    public static WebElement elementlocator(String locator, String locvalue) {
	        switch (locator) {
	            case "id":{
	            	try {
	            		System.out.println(locator);
		            	System.out.println(locvalue);
		            	System.out.println("retrieved id");
	            		return driver.findElement(By.id(locvalue));
	            		
					} catch (NoSuchElementException e) {
						//genReport("Locator not found " +locator, "info");
					}
	                }
	            
	            case "name":{
	            	try {
	            		return driver.findElement(By.name(locvalue));
					} catch (NoSuchElementException e) {
						//genReport("Locator not found " +locator, "info");
					}
	                }
	                
	            case "linktext":{
	            	
	            	try {
	            		return driver.findElement(By.linkText(locvalue));
	            		
					} catch (NoSuchElementException e) {
						//genReport("Locator not found " +locator+"& locator value is"+locvalue, "info");
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
	    /*public static WebElement elementlocator1(String locator, String locvalue) {
	        switch (locator) {
	            case "id":{
	            	System.out.println(locator);
	            	System.out.println(locvalue);
	            	System.out.println("retrieved id");
	                return driver.findElement(By.id(locvalue));}
	            case "name":{
	                return driver.findElement(By.name(locvalue));}
	            case "linktext":{
	                return driver.findElement(By.linkText(locvalue));}
	            case "xpath":{
	                return driver.findElement(By.xpath(locvalue));}
	            case "cssselector":{
	                return driver.findElement(By.cssSelector(locvalue));}
	            default:
	                return null;
	        }
	    }*/
	   /* public static void performAction1(String locator, String locvalue,String WebAction,  String Value) {
	    	
	    	WebElement Element=elementlocator(locator, locvalue);
	    	System.out.println("element is retrieved");
	        switch (WebAction) {
	            case "click":
	                Element.click();
	               // System.out.println("performed action on " +WebAction);
	               // genReport("performed action on " +WebAction);
	                break;
	            case "sendkeys":
	                Element.sendKeys(Value);
	               // System.out.println("enter data " +Value);
	               // genReport("enter data " +Value);
	                break;
	            case "select":
	            	Select sek=new Select(Element);
	            	sek.selectByVisibleText(Value);
	               // System.out.println("select data " +Value);
	               // genReport("select data" + Value);
	                break;
	            default:
	                System.out.println("Element not Found");
	   
	        }
	}*/
	    
	    public static void performAction(String locator, String locvalue,String WebAction,  String Value) {
	        WebElement Element=driver.findElement(By.id("username"));
	        switch (WebAction) {
	            case "click":
	            	try {
	            		 Element.click();
	                     // System.out.println("performed action on " +WebAction);
	                      //genReport("performed action on " +WebAction, "info");
					} catch (Exception e) {
						// genReport("Not performed action on " +WebAction, "info");
					}
	               
	                break;
	            case "sendkeys":
	                Element.sendKeys(Value);
	               // System.out.println("enter data " +Value);
	               // genReport("enter data " +Value, "info");
	                break;
	            case "select":
	            	Select sek=new Select(Element);
	            	sek.selectByVisibleText(Value);
	               // System.out.println("select data " +Value);
	              // genReport("select data" + Value,"info");
	                break;
	            default:
	                System.out.println("Element not Found");
	   
	        }
	}
	    
	    public static boolean elementVerification(String locator, String locvalue){
	    	 WebElement Element=elementlocator(locator, locvalue);
	    	 boolean elementStatux=Element.isDisplayed();
	    	 return elementStatux;
	    }
	    
	    public static  void screenshot(String ScreenshotName) throws IOException{
			
			//To take screenshot
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile=new File("D:\\New folder\\SeleniumPractice\\"+ScreenshotName+".jpeg");
			FileUtils.copyFile(srcFile, destFile, true);	
		}
	    
	   
	    
	    public static String propertyValue(String keyvaluepair1) throws IOException{
			FileInputStream fis=new FileInputStream("object.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String usernameproperty=pro.getProperty(keyvaluepair1);
			String parts[]=usernameproperty.split(":");
			//String eleproperty=parts[0];
			String locValue=parts[1];
			System.out.println(locValue);
			return locValue;
		}
	    
	    public static String eleProperty(String keyvaluepair) throws IOException{
			FileInputStream fis=new FileInputStream("object.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String usernameproperty=pro.getProperty(keyvaluepair);
			String parts[]=usernameproperty.split(":");
			String locator=parts[0];
			System.out.println(locator);
			return locator;
		}
	    
	    public static void genReport(String Message){
	    	//System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	    	 Logger log=Logger.getLogger("samplelog");
			  PropertyConfigurator.configure("log4j.properties");
			  //System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			  log.info(Message);
	    }
	    
	    
	    public static void main(String[] args) throws IOException {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://demo.actitime.com");
			genReport("Browser is launched successfully");
			performAction(eleProperty("login.username"),propertyValue("login.username"), "sendkeys", "admin");
			//performAction("id", eleLocator("login_username_te_id"), "sendkeys", particularCellData("Sheet1",1,1));
		}
	  
	}

