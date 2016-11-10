package com.qedge.selenium.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {
public static void main(String[] args) {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To maximise the browser
	driver.manage().window().maximize();
	//To delete cookies
	driver.manage().deleteAllCookies();
	//To achieve synchronization
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//To pass url
	//alternate to driver.get
	driver.navigate().to("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	//To click on Tasks
	driver.findElement(By.cssSelector(".content.tasks")).click();
	//to get current url
	String taskurl=driver.getCurrentUrl();
	System.out.println(taskurl);
	//To click on back button
	driver.navigate().back();
	//To get back url
	String backurl=driver.getCurrentUrl();
	System.out.println(backurl);
	//To forward
	driver.navigate().forward();
	//To get forward url
	String forwardUrl=driver.getCurrentUrl();
	System.out.println(forwardUrl);
	//To refresh
	driver.navigate().refresh();
	//To click on logout button
	driver.findElement(By.id("logoutLink")).click();
	//To quit the browser
	driver.quit();
	
	
}
}
