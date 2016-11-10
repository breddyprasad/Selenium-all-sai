package com.comname.proname.java;

public class Methods {
	
	public void normalMethod(){
		System.out.println("normal method");
	}
	
	public static void  staticMethod(){
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.normalMethod();
		staticMethod();
	}
}
