package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerification {
public static void main(String[] args) {
	//To launch the Browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://facebook.com");
	//To get text from facebook page
	String actualTextwithSpaces=driver.findElement(By.xpath("//span[contains(text(),'Facebook © 2016')]")).getText();
	String expectedText="Facebook © 2016";
	String actualText=actualTextwithSpaces.trim();
	System.out.println(actualTextwithSpaces);
	System.out.println(actualText);
	if (expectedText.equals(actualText)) {
		System.out.println("Text pass");
	} else {
		System.out.println("Text fail");
	}
}
}
