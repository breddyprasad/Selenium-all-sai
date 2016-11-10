package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.locators.FirefoxLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAndKeyBoardActions {
@Test
public void mouseAndKeyBoardActions(){
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://seleniumhq.org");
	WebElement downloadRef=driver.findElement(By.xpath("//a[contains(text(),'Download')]"));
	//For doing mouse and keyboard actions 
	Actions act=new Actions(driver);
	act.moveToElement(downloadRef).perform();
	//To Right click on Download
	act.contextClick().perform();
	//For pressing down again 
	act.sendKeys(Keys.DOWN).perform();
	//For pressing down again
	act.sendKeys(Keys.DOWN).perform();
	//For pressing enter 
	act.sendKeys(Keys.ENTER).perform();
	
}
}
