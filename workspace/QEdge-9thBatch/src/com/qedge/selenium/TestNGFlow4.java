package com.qedge.selenium;

import org.testng.annotations.Test;

public class TestNGFlow4 {

	@Test()
	public void createCustomer(){
		System.out.println("create customer");
	}
	
	@Test(dependsOnMethods={"createCustomer"},enabled=false)
	public void editCustomer(){
		System.out.println("edit customer");
	}
	@Test(dependsOnMethods={"createCustomer"})
	public void deleteCustomer(){
		System.out.println("delete customer");
	}
	
	
}
