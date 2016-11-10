package com.qedge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("//input[@id='Email']")).sendKeys("arshad.skr29@gmail.com");
	driver.findElement(By.id("//input[@id='next']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.id("//input[@id='Passwd']")).sendKeys("t
	
}
}
