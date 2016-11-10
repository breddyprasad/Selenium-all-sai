package com.pagefunctions;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.generics.BrowserSpecific;
import com.generics.WebGeneric;

public class Login {

	public static void login() throws IOException{
		WebGeneric.driverSet("chrome");
		BrowserSpecific.generalBrowserActions();
		WebGeneric.driver.get("http://demo.actitime.com");
		WebGeneric.performAction(WebGeneric.locator("login_username"), WebGeneric.locatorValue("login_username"), "sendkeys", "admin");
	}
	
	public static void main(String[] args) throws IOException {
		login();
	}
}
