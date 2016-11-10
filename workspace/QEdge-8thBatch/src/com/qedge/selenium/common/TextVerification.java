package com.qedge.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerification {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(3000);
	String expectedText="Enter Time-Track";
	//To get actual text 
	//Find the element location
	WebElement EnterTimeTrackRef=driver.findElement(By.xpath("//td[contains(text(),'Enter Time')]"));
	//To get text
	String actualText=EnterTimeTrackRef.getText();
	System.out.println(actualText);
	if (expectedText.equals(actualText)) {
		System.out.println("Title pass");
	} else {
		System.out.println("Title fail");
	}
}
}
