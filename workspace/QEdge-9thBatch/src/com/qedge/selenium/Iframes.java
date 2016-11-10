package com.qedge.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	public void iframes() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/QEdge/Downloads/iframeweb.html");
		//To go inside sakshi frame
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[contains(text(),'Sakshi')]")).click();
		//To come out of the iframe
		driver.switchTo().defaultContent();
		WebElement iframeElement=driver.findElement(By.xpath("//iframe[@src='http://epaper.eenadu.net/']"));
		driver.switchTo().frame(iframeElement);
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
