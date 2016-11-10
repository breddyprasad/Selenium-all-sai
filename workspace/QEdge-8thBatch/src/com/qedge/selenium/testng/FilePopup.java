package com.qedge.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class FilePopup {
@Test
public void fileDownload(){
	//For doing predefined settings to the browser
	FirefoxProfile prof=new FirefoxProfile();
	//For downloading the file 
	prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	//For downloading the file in to the downloads parameter is 1
	//For downloading the file in to the desktop parameter is 0
	//For downloading the file in to the other driver is 2
	
	prof.setPreference("browser.download.folderList", 2);
	prof.setPreference("browser.download.dir", "D:\\Newfolder");
	WebDriver driver=new FirefoxDriver(prof);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://seleniumhq.org");
	driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
	driver.findElement(By.xpath("//a[@href='http://selenium-release.storage.googleapis.com/2.53/selenium-java-2.53.0.zip']")).click();
}
}
