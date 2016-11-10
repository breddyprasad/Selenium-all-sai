package com.qedge.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.handler.codec.http.websocketx.WebSocketVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleElements {
	static WebDriver driver;
	@BeforeClass
	public void launch(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test(enabled=false)
	public void verifyingAllLinks(){
		driver.get("http://flipkart.com");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int size=allLinks.size();
		for (int i = 0; i < size; i++) {
			WebElement indLink=allLinks.get(i);
			String indLinkText=indLink.getText();
			System.out.println(indLinkText);
		}

	}
	
	@Test
	public void performActiononCheckboxes(){
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		List<WebElement> allCheckBoxRef=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size=allCheckBoxRef.size();
		for (int i = 0; i < size; i++) {
			WebElement indCheckBox=allCheckBoxRef.get(i);
			indCheckBox.click();
			
		}
	}
}
