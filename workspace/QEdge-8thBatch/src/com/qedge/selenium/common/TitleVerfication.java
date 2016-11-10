package com.qedge.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerfication {
	public static void main(String[] args) throws InterruptedException {
		//To launch the browser
		WebDriver driver=new FirefoxDriver();
		//To pass the url
		driver.get("http://demo.actitime.com");
		//To find element location
		//To perform action on userName
		driver.findElement(By.id("username")).sendKeys("admin");
		//To find location for password
		//To perform action on password field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//To find location for login button
		//To perform action on login button
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title pass");
		} else {
			System.out.println("Title fail");
		}
	}
	
}
