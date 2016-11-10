package com.qedge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogout2 {
public static void main(String[] args) throws InterruptedException {
	//To Launch the Browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To find the element location
	WebElement userNameRef=driver.findElement(By.id("username"));
	//To perform action on username field
	userNameRef.sendKeys("admin");
	//To find password location
	WebElement passwordRef=driver.findElement(By.name("pwd"));
	//To perform action on password field
	passwordRef.sendKeys("manager");
	//To find the login location
	WebElement loginRef=driver.findElement(By.xpath("//a[@id='loginButton']"));
	//To perform action on login field
	loginRef.click();
	//Forcing Wait the Browser to load
	Thread.sleep(3000);
	WebElement logoutRef=driver.findElement(By.linkText("Logout"));
	logoutRef.click();
	
}
}
