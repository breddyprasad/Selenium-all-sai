package com.qedge.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicsofTestNG6 {

@Test()
public void createCustomer(){
	System.out.println("create customer");
}
//For disabling test case
@Test(enabled=false)
public void editCustomer(){
	System.out.println("edit customer");
}

@Test()
public void deleteCustomer(){
	System.out.println("delete customer");
}
}
