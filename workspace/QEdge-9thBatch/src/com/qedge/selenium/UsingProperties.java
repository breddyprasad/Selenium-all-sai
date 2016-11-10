package com.qedge.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingProperties {
	static WebDriver driver;
	/* Method is used for finding webElement
	 * parameters are locator and locator value
	 * return type is WebElement
	 */
	public static WebElement elementLocator(String locator,String locValue){
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
public static void main(String[] args) throws IOException {
	
	
	driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	WebElement username=elementLocator(locator("login_username"), locatorValue("login_username"));
	username.sendKeys("admin");
	elementLocator(locator("login_password"), locatorValue("login_password")).sendKeys("manager");
	elementLocator(locator("login_linktext"), locatorValue("login_linktext")).click();
	
	
}
}
