package com.selenium.framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4J {
public static void main(String[] args) {
	Logger log=Logger.getLogger("Regreesion");
	PropertyConfigurator.configure("log4j.properties");
	WebDriver driver=new FirefoxDriver();
	log.info("Browser is launched successfully");
	driver.manage().window().maximize();
	log.info("Browser is maximized");
	driver.get("http://demo.actitime.com");
	log.info("url passed successfully");
}
}
