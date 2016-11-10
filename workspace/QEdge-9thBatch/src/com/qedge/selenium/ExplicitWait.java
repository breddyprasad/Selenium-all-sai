package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	//To launch the Browser
	WebDriver driver=new FirefoxDriver();
	//To Maximize the browser window
	driver.manage().window().maximize();
	//To delete all cookies
	driver.manage().deleteAllCookies();
	/*//To achieve synchronization
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
	//To pass the url
	driver.navigate().to("http://demo.actitime.com");
	//To find username location and performing action
	driver.findElement(By.id("username")).sendKeys("admin");
	//To find password location and performing action
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//To find login location and perform action
	driver.findElement(By.linkText("Login")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 4);
	wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
}
}
