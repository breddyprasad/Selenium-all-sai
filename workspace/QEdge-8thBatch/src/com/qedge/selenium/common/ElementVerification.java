package com.qedge.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVerification {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(3000);
	/*WebElement logoutRef=driver.findElement(By.linkText("logoutLink"));
	logoutRef.isDisplayed();*/
	boolean elementVerification=driver.findElement(By.linkText("Logout")).isDisplayed();
	System.out.println(elementVerification);
}
}
