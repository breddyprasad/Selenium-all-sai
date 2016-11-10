package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FilePopup {
@Test
public void fileDownload(){
	//For doing predefined settings to the browser
	FirefoxProfile prof=new FirefoxProfile();
	//For downloading the file
	prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	//For downloading the file in to the specified folder parameter is 2
	//For downloading the file in to the downloads 1
	//For downloading the file in to the desktop 0
	prof.setPreference("browser.download.folderList", 2);
	prof.setPreference("browser.download.dir", "F:\\");
	WebDriver driver=new FirefoxDriver(prof);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://seleniumhq.org");
	driver.findElement(By.xpath("//li[@id='menu_download']/a[contains(text(),'Download')]")).click();
	driver.findElement(By.xpath("//a[contains(@href,'http://selenium-release.storage.googleapis.com/2.53/selenium-java-2.53.1.zip')]")).click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();
}
}
