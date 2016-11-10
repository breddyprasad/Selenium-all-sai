package com.qedge.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//To Intialize the Browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To quit the Browser
	driver.quit();
}
}
