package com.comname.proname.java;

public class MethodTypes {

	public static void methodWithOutParameters(){
	System.out.println("method with out parameters");
}
	
	public static void methodWithParameters(String name){
		System.out.println(name);
	}
	//method with return type and with out parametets
	public static int add(){
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	public static int sub(int a, int b){
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) {
		methodWithOutParameters();
		methodWithParameters("Amar");
		int d=add();
		int e=sub(20,10);
		System.out.println(d);
		System.out.println(e);
	}
}
