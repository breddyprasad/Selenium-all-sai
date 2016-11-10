package com.qedge.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsofTestNG3 {
@BeforeClass
public void launchBrowser(){
	System.out.println("launch browser");
}
@BeforeMethod
public void login(){
	System.out.println("login");
}
@Test
public void testcase1(){
	System.out.println("execute test case1");
}
@AfterMethod
public void logout(){
	System.out.println("logout");
}
@AfterClass
public void quitBrowser(){
	System.out.println("quit browser");
}
}
