package com.qedge.selenium;

import org.testng.annotations.Test;

public class TestNGFlow2 {

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
