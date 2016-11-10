package com.qedge.selenium.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {

public static void fileUpload() throws IOException{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Runtime.getRuntime().exec("C:\\Users\\QEdge\\Desktop\\uploadfile.exe");
}

public static void main(String[] args) throws IOException {
	fileUpload();
}
}
