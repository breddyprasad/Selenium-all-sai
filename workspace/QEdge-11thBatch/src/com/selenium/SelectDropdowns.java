package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {
	static WebDriver driver;
	public static void singleSelect() throws InterruptedException{
		//To launch the browser
		driver=new FirefoxDriver();
		//To maximise the window
		driver.manage().window().maximize();
		//To delete cookies
		driver.manage().deleteAllCookies();
		//To achieve synchronization
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To pass the url
		driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
		//For working with select dropdowns find the webElement
		WebElement ssdRef=driver.findElement(By.xpath("//select[@value='city']"));
		//For working with select classes
		Select sel=new Select(ssdRef);
		//For selecting value from select dropdown using index
		//For selecting tirupati using index
		sel.selectByIndex(3);
		Thread.sleep(3000);
		//For selecting chennai using visible text
		sel.selectByVisibleText("Chenni");
		Thread.sleep(3000);
		//For selecting hyderabad using value
		sel.selectByValue("3");
		Thread.sleep(3000);
		
	}
	
	public static void multiSelect() throws InterruptedException{
		//To launch the browser
				driver=new FirefoxDriver();
				//To maximise the window
				driver.manage().window().maximize();
				//To delete cookies
				driver.manage().deleteAllCookies();
				//To achieve synchronization
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//To pass the url
				driver.get("file:///C:/Users/QEdge/Downloads/demowebpage.html");
				//For working with select dropdowns find the webElement
				WebElement msdRef=driver.findElement(By.xpath("//select[@multiple='True']"));
				//For working with select classes
				Select sel=new Select(msdRef);
				//For selecting value from select dropdown using index
				//For selecting tirupati using index
				sel.selectByIndex(3);
				Thread.sleep(3000);
				//For selecting chennai using visible text
				sel.selectByVisibleText("Chenni");
				Thread.sleep(3000);
				//For selecting hyderabad using value
				sel.selectByValue("3");
				Thread.sleep(3000);
				//For selecting bangalore using index
				sel.selectByIndex(0);
				//To deselect chennai using visible text
				sel.deselectByVisibleText("Chenni");
				//To deselect all
				//sel.deselectAll();
				//To get selected options
				List<WebElement> allOptionsRef=sel.getAllSelectedOptions();
				//To get individual web element
				for (int i = 0; i < allOptionsRef.size(); i++) {
					WebElement element=allOptionsRef.get(i);
					String elementText=element.getText();
					System.out.println(elementText);
				}
				
				
	}
	
	public static void main(String[] args) throws InterruptedException {
		multiSelect();
	}
}
