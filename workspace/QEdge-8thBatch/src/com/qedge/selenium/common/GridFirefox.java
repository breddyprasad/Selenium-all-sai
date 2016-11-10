package com.qedge.selenium.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridFirefox {
	static WebDriver driver;
	@Test
public static void gridff() throws MalformedURLException {
	DesiredCapabilities capability=DesiredCapabilities.firefox();
	driver =new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"), capability);
	driver.get("http://demo.actitime.com");
}
}
