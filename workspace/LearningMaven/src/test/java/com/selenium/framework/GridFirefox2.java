package com.selenium.framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridFirefox2 {
	static WebDriver driver;
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities capability=DesiredCapabilities.firefox();
	driver =new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), capability);
	driver.get("http://demo.actitime.com");
}
}
