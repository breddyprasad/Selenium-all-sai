package com.selenium.framework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
		static WebDriver driver;
	public static void screenshot(String name) throws IOException{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:\\"+name+".jpeg");
		FileUtils.copyFile(srcFile, destFile,true);
	}
	public static void main(String[] args) throws IOException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com");
		screenshot("loginpage");
		
		
	}
	
}
