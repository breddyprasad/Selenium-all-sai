package com.qedge.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerification {
	
	public static void main(String[] args) throws InterruptedException {
		//To launch the browser
		WebDriver driver=new FirefoxDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find username location and performing action
		driver.findElement(By.id("username")).sendKeys("admin");
		//To find password location and performing action
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//To find login location and perform action
		driver.findElement(By.linkText("Login")).click();
		//For waiting the browser to load
		Thread.sleep(3000);
		String expectedText="Enter Time-Track";
		//To verify element text
		WebElement textRef=driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]"));
		//To get the text from textRef
		String actualText=textRef.getText();
		if (expectedText.equals(actualText)) {
			System.out.println("Text pass");
		} else {
			System.out.println("Text fail");
		}
		
	}
}
