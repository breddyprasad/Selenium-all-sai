package com.qedge.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OtherBrowsers {
@Test(enabled=false)
public void chromeBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\QEdge\\Downloads\\chromedriver_win32(3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com");
}

@Test
public void ieBrowser(){
	System.setProperty("webdriver.ie.driver", "C:\\Users\\QEdge\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://demo.actitime.com");
}
}
