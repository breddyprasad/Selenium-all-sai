package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {
public static void main(String[] args) {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To maximize the window
	driver.manage().window().maximize();
	//To delete cookies
	driver.manage().deleteAllCookies();
	//To achieve synchronization
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//To pass the url
	//driver.get("http://demo.actitime.com");
	driver.navigate().to("http://demo.actitime.com");
	//To perform action on username
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	//To perform action on Task
	driver.findElement(By.cssSelector(".content.tasks")).click();
	//To get the current url
	String taskurl=driver.getCurrentUrl();
	//To navigate back
	driver.navigate().back();
	String backurl=driver.getCurrentUrl();
	//To navigate forward
	driver.navigate().forward();
	String forwardUrl=driver.getCurrentUrl();
	//To do refresh
	driver.navigate().refresh();
	System.out.println(taskurl);
	System.out.println(backurl);
	System.out.println(forwardUrl);
	//To logout
	driver.findElement(By.id("logoutLink")).click();
	//To quit the browser
	driver.quit();
	
}
}
