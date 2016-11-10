package com.qedge.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	static WebDriver driver;
	public static void screenshot(String name) throws IOException{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile =new File("D:\\"+name+".jpeg");
		FileUtils.copyFile(srcFile, destFile, true);
	}
@Test
public void multipleWindows() throws InterruptedException, IOException{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://irctc.co.in");
	driver.findElement(By.xpath("//a[contains(text(),'Flight Tickets')]")).click();
	Set<String> allWindows=driver.getWindowHandles();
	Iterator<String> ie=allWindows.iterator();
	String parentWindow=ie.next();
	String childWindow=ie.next();
	driver.switchTo().window(childWindow);
	screenshot("childWindow1");
	Thread.sleep(3000);
	driver.findElement(By.id("origin")).sendKeys("Tirupathi");	
	driver.switchTo().window(parentWindow);
	screenshot("parentWindow1");
	Thread.sleep(3000);
	driver.findElement(By.id("usernameId")).sendKeys("kumar");
	Thread.sleep(3000);
	driver.switchTo().window(childWindow);
	//To close the browser
	driver.close();
	Thread.sleep(3000);
	//To quit the browser
	driver.quit();
}
}
