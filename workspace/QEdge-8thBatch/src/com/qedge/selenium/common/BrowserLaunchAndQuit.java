package com.qedge.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchAndQuit {
public static void main(String[] args) throws InterruptedException {
	//For launching the Browser
	WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To wait
	Thread.sleep(3000);
	//To quit the Browser
	driver.quit();
	
	
	
}
}
