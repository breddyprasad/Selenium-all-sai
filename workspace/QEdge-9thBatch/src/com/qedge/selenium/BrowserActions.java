package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {
public static void main(String[] args) {
	//To launch the Browser
	WebDriver driver=new FirefoxDriver();
	//To Maximize the browser window
	driver.manage().window().maximize();
	//To delete all cookies
	driver.manage().deleteAllCookies();
	//To achieve synchronization
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//To pass the url
	driver.navigate().to("http://demo.actitime.com");
	//To find username location and performing action
	driver.findElement(By.id("username")).sendKeys("admin");
	//To find password location and performing action
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//To find login location and perform action
	driver.findElement(By.linkText("Login")).click();
	//To perform action on Tasks
	driver.findElement(By.cssSelector(".content.tasks")).click();
	//To get the tasks url
	String taskUrl=driver.getCurrentUrl();
	System.out.println(taskUrl);
	//To perform back click 
	driver.navigate().back();
	//To refresh the page
	driver.navigate().refresh();
	//To get the back url
	String backurl=driver.getCurrentUrl();
	System.out.println(backurl);
	//To do forward
	driver.navigate().forward();
	String forwardurl=driver.getCurrentUrl();
	System.out.println(forwardurl);
	//To quit the browser
	//driver.quit();
	
	
}
}
