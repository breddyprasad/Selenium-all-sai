package com.qedge.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsofTestNG4 {

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
