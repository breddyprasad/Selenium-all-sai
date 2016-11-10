package com.qedge.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
@Test
public void fileUpload() throws IOException{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Runtime.getRuntime().exec("C:/Users/QEdge/Desktop/Btch9upload.exe");
}
}
