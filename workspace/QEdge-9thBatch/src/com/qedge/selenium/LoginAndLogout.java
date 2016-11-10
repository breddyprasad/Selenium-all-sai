package com.qedge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogout {
public static void main(String[] args) throws InterruptedException {
	//To Launch the Browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To find the element location
	//To perform action on username field
	driver.findElement(By.id("username")).sendKeys("admin");
	//To find password location
	//To perform action on password field
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//To find the login location
	//To perform action on login field
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	//Forcing Wait the Browser to load
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	
}
}
