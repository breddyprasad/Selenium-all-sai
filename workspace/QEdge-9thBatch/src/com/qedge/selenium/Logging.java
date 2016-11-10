package com.qedge.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logging {
public static void main(String[] args) {
	Logger log=Logger.getLogger("Regression");
	PropertyConfigurator.configure("log4j.properties");
	WebDriver driver=new FirefoxDriver();
	log.info("browser is launched");
	driver.manage().window().maximize();
	log.info("browser is maximised");
	driver.manage().deleteAllCookies();
	log.info("deleted cookies");
	
}
}
