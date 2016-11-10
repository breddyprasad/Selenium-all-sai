package com.project.smoketestcases;

import org.testng.annotations.Test;


import com.qedge.project.functions.PageFunctions2;

public class AddToCart extends PageFunctions2 {
	
	@Test
	public static void updateQuantity(){
		
		createAccount();
		login();
		search();
		
		
	}
	
	@Test
	public static void modifyQuantity(){
		
	}
}
