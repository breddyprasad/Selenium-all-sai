package com.qedge.selenium.testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class Iframes {
	static WebDriver driver;
	public static String date(){
		Date date=new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");  
		 String strDate= formatter.format(date);  
		 System.out.println(strDate);
		 return strDate;
	}
	public static void Screenshot(String name) throws IOException{
		String date1=date();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile =new File("C:\\Users\\QEdge\\workspace\\"+name+""+date1+".jpeg");
		org.apache.commons.io.FileUtils.copyFile(srcFile, destFile, true);
		
	}
@Test(enabled=false)
public void iframe(){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("file:///C:/Users/QEdge/Downloads/iframeweb.html");
	//To switch in to sakshi iframe by using index
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//a[contains(text(),'Sakshi')]")).click();
	//To come out of the frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='http://epaper.eenadu.net/']")));
	driver.findElement(By.xpath("//span[contains(text(),'DIRECT  ACCESS')]")).click();
	//driver.close();
}

@Test
public void verifyAllIframes() throws IOException{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://timesofindia.indiatimes.com/");
	List<WebElement> iframeRef=driver.findElements(By.tagName("iframe"));
	for (int i = 0; i < iframeRef.size(); i++) {
		String iframeName=iframeRef.get(i).getAttribute("name");
		System.out.println(iframeName);
	
	}
	Screenshot("testdate");
	
	
	
}
}
