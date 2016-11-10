package com.qedge.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.OaIdl.DATE;

public class Popups {
@Test(enabled=false)
public void alertPopup(){
	//To launch firefox driver
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.cssSelector(".content.tasks")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("arshad");
	driver.findElement(By.id("customerLightBoxCloseButton")).click();
	//To handle alerts
	Alert alt=driver.switchTo().alert();
	//To get the text from the alert
	String altText=alt.getText();
	System.out.println(altText);
	//To accept the alert
	//alt.accept();
	//To dismiss the alert
	alt.dismiss();
	
}
@Test
public void calendarPopup(){
	//To Read the present date
	Date d1=new Date();
	//To get date in specified format
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	String strDate= formatter.format(d1);
	//In order to  split and to convert in to array
	String date[]=strDate.split("/");
	String date1=date[0];
	String month1=date[1];
	String year1=date[2];
	//To convert strings in to int
	int month2=Integer.parseInt(month1);
	int month3=month2-1;
	int year2=Integer.parseInt(year1);
	int date2=Integer.parseInt(date1);
	System.out.println(date2);
	System.out.println(month2);
	System.out.println(year2);
	
	System.out.println(strDate);  
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://spicejet.com");
	driver.findElement(By.cssSelector(".picker-first2>button")).click();

	driver.findElement(By.xpath("//td[@data-year='"+year2+"' and  @data-month='"+month3+"']/a[contains(text(),'"+date2+"')]")).click();
}
}
