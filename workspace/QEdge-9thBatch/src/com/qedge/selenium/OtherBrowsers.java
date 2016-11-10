package com.qedge.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OtherBrowsers {
@Test(enabled=false)
public void chromeBrowser(){
	//To set the system property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\QEdge\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
	//To launch the Browser
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumhq.org");
}
@Test
public void ieBrowser(){
	//To set the system property
	System.setProperty("webdriver.ie.driver", "C:/Users/QEdge/Downloads/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
	//To launch the Browser
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://seleniumhq.org");
}
}
