package com.qedge.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxVerification {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	WebElement checkBoxRef=driver.findElement(By.id("keepLoggedInCheckBox"));
	boolean checkBoxBC=checkBoxRef.isSelected();
	//To click on checkbox
	checkBoxRef.click();
	boolean checkBoxAC=checkBoxRef.isSelected();
	System.out.println(checkBoxBC);
	System.out.println(checkBoxAC);
	
	
}
}
