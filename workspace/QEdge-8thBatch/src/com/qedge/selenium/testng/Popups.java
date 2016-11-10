package com.qedge.selenium.testng;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

public class Popups {

	@Test(enabled=false)
	public void alertPopup(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		WebDriverWait waitp=new WebDriverWait(driver, 10, 400);
		waitp.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		driver.findElement(By.cssSelector(".content.tasks")).click();
		waitp.until(ExpectedConditions.urlToBe("http://demo.actitime.com/tasks/otasklist.do"));
		driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("subrat");
		driver.findElement(By.id("customerLightBoxCloseButton")).click();
		
		Alert alt=driver.switchTo().alert();
		String altText=alt.getText();
		System.out.println(altText);
		alt.accept();
		//To dismiss the alert
		//alt.dismiss();
	
	}
	
	public static String date1(){
		Date d=new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		   String d1= formatter.format(d); 
		  return d1;
		 
		   
	
	
		
	}
	public static void main(String[] args) {
		date1();
	}
	@Test
	public void calendarPopup(){
		String d1=date1();
		 String d2[]=d1.split("/");
		   String month=d2[0];
		   String date=d2[1];
		   int month1=Integer.parseInt(month);
		   int month2=month1-1;
		   String year=d2[2];
		   
		   int date1=Integer.parseInt(date);
		   int year1=Integer.parseInt(year);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");
		driver.findElement(By.cssSelector(".picker-first2>button")).click();
		driver.findElement(By.xpath("//td[@data-year='"+year1+"' and @data-month='"+month2+"']/a[contains(text(),'"+date1+"')]")).click();
	}
}