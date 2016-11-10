package com.qedge.selenium;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFlow5 {

	@BeforeClass
	public void launchBrowser(){
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("Logout");
	}
	
	@org.testng.annotations.AfterClass
	public void quitBrowser(){
		System.out.println("quit browser");
	}
	@Test(priority=0)
	public void createCustomer(){
		System.out.println("create customer");
	}
	
	@Test(priority=1)
	public void editCustomer(){
		System.out.println("edit customer");
	}
	@Test(priority=2)
	public void deleteCustomer(){
		System.out.println("delete customer");
	}
	
	
}
