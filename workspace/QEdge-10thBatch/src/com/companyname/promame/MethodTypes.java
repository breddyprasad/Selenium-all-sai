package com.companyname.promame;

public class MethodTypes {
	
	public void normalMethod(){
		System.out.println("normal method");
	}
	
	public static void staticMethod(){
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
	  //syntax for creating object
	  //ClassName objName=new ClassName();
	  
		MethodTypes m1=new MethodTypes();
		
		m1.normalMethod();
		staticMethod();
		
	}
	
}
