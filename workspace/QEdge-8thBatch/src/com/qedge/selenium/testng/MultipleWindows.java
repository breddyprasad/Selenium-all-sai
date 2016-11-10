package com.qedge.selenium.testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows {

	@Test
	public void handlingMultipleWindows() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://irctc.co.in");
		driver.findElement(By.xpath("//a[text()='Flight Tickets']")).click();
		Set<String> allWindows=driver.getWindowHandles();
		int no=allWindows.size();
		Iterator<String> ie=allWindows.iterator();
		String parentWindow=ie.next();
		String childWindow=ie.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("tirupati");
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("usernameId")).sendKeys("sai");
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
