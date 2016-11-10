package com.qedge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxVerification {
public static void main(String[] args) {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To pass the url
	driver.get("http://demo.actitime.com");
	//To find the checkbox location
	WebElement checkboxRef=driver.findElement(By.id("keepLoggedInCheckBox"));
	//To find the checkbox status
	boolean checkboxStatusBC=checkboxRef.isSelected();
	System.out.println(checkboxStatusBC);
	//To perform action on checkbox
	checkboxRef.click();
	//To check the checkbox status after click
	boolean checkboxStatusAC=checkboxRef.isSelected();
	System.out.println(checkboxStatusAC);
	checkboxRef.click();
	//To check the checkbox status after click
	boolean checkboxStatusAC2=checkboxRef.isSelected();
	System.out.println(checkboxStatusAC2);
}
}
