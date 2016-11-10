package com.qedge.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsofTestNG2 {
@BeforeClass
public void launchBrowser(){
	System.out.println("before class");
}
@BeforeMethod
public void login(){
	System.out.println("before method");
}
@Test
public void testcase1(){
	System.out.println("execute test case1");
}
@Test
public void testcase2(){
	System.out.println("execute test case2");
}
@AfterMethod
public void logout(){
	System.out.println("after method");
}
@AfterClass
public void quitBrowser(){
	System.out.println("after class");
}
}
