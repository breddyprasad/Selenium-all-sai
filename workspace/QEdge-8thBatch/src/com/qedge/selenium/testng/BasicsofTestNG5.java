package com.qedge.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsofTestNG5 {

@Test()
public void createCustomer(){
	System.out.println("create customer");
}

@Test(dependsOnMethods={"createCustomer"})
public void editCustomer(){
	System.out.println("edit customer");
}

@Test(dependsOnMethods={"createCustomer","editCustomer"})
public void deleteCustomer(){
	System.out.println("delete customer");
}
}
