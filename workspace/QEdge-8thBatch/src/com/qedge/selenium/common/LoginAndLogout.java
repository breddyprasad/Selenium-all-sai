package com.qedge.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogout {
public static void main(String[] args) throws InterruptedException {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To find element location
	WebElement userNameRef=driver.findElement(By.id("username"));
	//To perform action on userName
	userNameRef.sendKeys("admin");
	//To find location for password
	WebElement passwordRef=driver.findElement(By.name("pwd"));
	//To perform action on password field
	passwordRef.sendKeys("manager");
	//To find location for login button
	WebElement loginButton=driver.findElement(By.linkText("Login"));
	//To perform action on login button
	loginButton.click();
	//To wait for the Browser to load
	Thread.sleep(3000);
	//To find the location for logout button
	WebElement logoutRef=driver.findElement(By.linkText("Logout"));
	logoutRef.click();
	Thread.sleep(3000);
	//To quit the Browser
	driver.quit();
	
}
}
