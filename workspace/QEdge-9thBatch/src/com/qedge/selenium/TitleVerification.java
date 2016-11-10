package com.qedge.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerification {
public static void main(String[] args) {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");

	String expectedTitle="actiTIME - Login";
	//To get the title from the browser
	String actualTitle=driver.getTitle();
	if (expectedTitle.equals(actualTitle)) {
		System.out.println("Title pass");
	} else {
		System.out.println("Title fail");
	}
	
	
}
}
