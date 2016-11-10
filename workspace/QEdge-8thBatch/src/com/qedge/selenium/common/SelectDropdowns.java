package com.qedge.selenium.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {
public static void singleSelectDropdown() throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	//To find the element location for single select dropdown
	WebElement ssdRef=driver.findElement(By.xpath("//select[@value='city']"));
	//For performing action on select dropdowns we have three ways
	/*1. By using index
	2. By using value
	3. By using visible text*/
	//For working with select dropdowns, we have to create object for select dropdown
	Select sel=new Select(ssdRef);
	//For selecting tirupati by using index
	sel.selectByIndex(3);
	Thread.sleep(3000);
	//For selecting chennai by using value
	sel.selectByValue("2");
	Thread.sleep(3000);
	//For selecting hydreabd by using visible text
	sel.selectByVisibleText("Hyderabad");
	
	
}

public static void multipleSelectDropdown() throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	//To find the element location for single select dropdown
	WebElement msdRef=driver.findElement(By.xpath("//select[@multiple='True']"));
	//For performing action on select dropdowns we have three ways
	/*1. By using index
	2. By using value
	3. By using visible text*/
	//For working with select dropdowns, we have to create object for select dropdown
	Select sel=new Select(msdRef);
	//For selecting tirupati by using index
	sel.selectByIndex(3);
	Thread.sleep(3000);
	//For selecting chennai by using value
	sel.selectByValue("2");
	Thread.sleep(3000);
	//For selecting hydreabd by using visible text
	sel.selectByVisibleText("Hyderabad");
	List<WebElement> allSelOptionsRef=sel.getAllSelectedOptions();
	for (int i = 0; i < allSelOptionsRef.size(); i++) {
		WebElement indOption=allSelOptionsRef.get(i);
		String optiontext=indOption.getText();
		System.out.println(optiontext);
	}
	
	
	
	
}
public static void main(String[] args) throws InterruptedException {
	multipleSelectDropdown();
}
}
