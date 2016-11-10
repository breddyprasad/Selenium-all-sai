package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://seleniumhq.org");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(document.body.scrollWidth, document.body.scrollHeight)", "");
}
}
