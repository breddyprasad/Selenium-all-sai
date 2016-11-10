package com.qedge.java;

public class Methods {
	
	
	public void normalMethod(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void staticMethod(){
		int a=20;
		int b=30;
		int c=b-a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Methods m1=new Methods();
		m1.normalMethod();
		staticMethod();
	}
}
