package com.generics;

import java.util.concurrent.TimeUnit;


import com.logging.Logging;

public class BrowserSpecific {

	public static void browserMaximize(){
		WebGeneric.driver.manage().window().maximize();
		Logging.genReport("Browser is maximised");
	}
	
	public static void implicitWait(){
		WebGeneric.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Logging.genReport("implicit wait is maintained");
	}
	
	public static void deleteCookies(){
		WebGeneric.driver.manage().deleteAllCookies();
		Logging.genReport("delete all cookies");
	}
	
	public static void generalBrowserActions(){
		browserMaximize();
		implicitWait();
		deleteCookies();
	}
}
