package com.qedge.selenium.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridIE {
	static WebDriver driver;
	@Test
public static void gridIE() throws MalformedURLException {
	DesiredCapabilities capability=DesiredCapabilities.internetExplorer();
	capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	driver =new RemoteWebDriver(new URL("http://localhost:7799/wd/hub"), capability);
	driver.get("http://demo.actitime.com");
}
}
