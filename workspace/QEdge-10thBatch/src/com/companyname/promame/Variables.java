package com.companyname.promame;

public class Variables {
	
	int a=10;  //instance variable
	static int b=20;  //static variable
	
	
	public static void main(String[] args) {
		int c=30;  //local variable
		//syntax for the object
		//ClassName objName=new ClassName;
		Variables v1=new Variables();
		int d=v1.a;
		int e=d+b;
		System.out.println(e);
		System.out.println(v1.a);
		System.out.println(b);
		System.out.println(c);
	}
}
