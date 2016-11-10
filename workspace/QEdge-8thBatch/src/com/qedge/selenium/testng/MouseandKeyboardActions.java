package com.qedge.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseandKeyboardActions {
	static WebDriver driver;
	@BeforeClass
	public void launchBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void mouseAndKeyboardAction(){
		driver.get("http://seleniumhq.org");
		WebElement downloadRef=driver.findElement(By.xpath("//a[text()='Download']"));
		Actions act=new Actions(driver);
		act.moveToElement(downloadRef).perform();
		//To perform mouse right click
		act.contextClick().perform();
		/*act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();*/
		act.sendKeys("W").perform();
		
	}

}
