package com.qedge.selenium.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyingAllLinks {
	static WebDriver driver;
@BeforeClass
public void launchBrowser(){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test(enabled=false)
public void allLinks(){
	
	driver.get("http://flipkart.com");
	//To find all the links in a webpage
	List<WebElement> allLinkRef=driver.findElements(By.xpath("//a"));
	//To find the size of all links
	int size=allLinkRef.size();
	System.out.println(size);
	for (int i = 0; i < size; i++) {
		WebElement indLink=allLinkRef.get(i );
		String indLinkText=indLink.getText();
		System.out.println("Link"+i+" "+indLinkText);
	}	
}
@Test
public void allCheckBoxes(){
	driver.get("http://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	//To click on tasks
	driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
	List<WebElement> allCheckBoxRef=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (int i = 0; i < allCheckBoxRef.size(); i++) {
		/*WebElement indCheckBox=allCheckBoxRef.get(i);
		//To perform action on indCheckBox
		indCheckBox.click();*/
		allCheckBoxRef.get(i).click();
	}
	
}
}
