package com.qedge.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {
public static void singleSelectDropdown() {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To maximise the window
	driver.manage().window().maximize();
	//To delete cookies
	driver.manage().deleteAllCookies();
	//To pass the url
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	WebElement element=driver.findElement(By.xpath("//select[@value='city']"));
	//For working with Select dropdowns
	Select sel=new Select(element);
	//For selecting tirupati by using index
	sel.selectByIndex(3);
	//For selecting hyderabd by using value
	sel.selectByValue("3");
	//For selecting chennai by using visible text
	sel.selectByVisibleText("Chenni");
}
public static void main(String[] args) {
	//To launch the browser
	WebDriver driver=new FirefoxDriver();
	//To maximise the window
	driver.manage().window().maximize();
	//To delete cookies
	driver.manage().deleteAllCookies();
	//To pass the url
	driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
	WebElement element=driver.findElement(By.xpath("//select[@multiple='True']"));
	//For working with multiple Select dropdowns
	Select sel=new Select(element);
	//For selecting tirupati by using index
	sel.selectByIndex(3);
	//For selecting hyderabd by using value
	sel.selectByValue("3");
	//For selecting chennai by using visible text
	sel.selectByVisibleText("Chenni");
	//For selecting Bangalore by using index
	sel.selectByIndex(0);
	//To deselect any value from select drop down
	sel.deselectByValue("2");
	//To deselect all
	//sel.deselectAll();
	List<WebElement> allSelectRef=sel.getAllSelectedOptions();
	int size=allSelectRef.size();
	for (int i = 0; i < size; i++) {
		WebElement singleOption=allSelectRef.get(i);
		String indOption=singleOption.getText();
		System.out.println(indOption);
		
	}
	
	
}
}
