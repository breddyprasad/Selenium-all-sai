package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingAllLinks {
	static WebDriver driver;
public static void main(String[] args) {
	//To launch the browser
	driver=new FirefoxDriver();
	//To maximise the window
	driver.manage().window().maximize();
	//To delete cookies
	driver.manage().deleteAllCookies();
	//To achieve synchronization
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//To launch the browser
	driver.get("http://flipkart.com");
	//To find ref for all the links
	List<WebElement> allLinkRef=driver.findElements(By.xpath("//a"));
	//for finding the size
	int size=allLinkRef.size();
	for (int i = 0; i < size; i++) {
		/*WebElement linkRef=allLinkRef.get(i);
		String linkText=linkRef.getText();
		System.out.println(linkText);*/
		System.out.println(allLinkRef.get(i).getText());
	}
}
}
