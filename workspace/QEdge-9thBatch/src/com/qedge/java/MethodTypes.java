package com.qedge.java;

public class MethodTypes {

	public static void methodwithoutParameters(){
		System.out.println("example for method with out parameters");
	}
	
	//method with parameters
	public static void display(String name1, String name2){
		System.out.println(name1);
		System.out.println(name2);
	}
	
	//method with out parameters and return type
	public static int sum(){
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//method with parameters and return type
	public static int sum(int a, int b){
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		methodwithoutParameters();
		display("sreedhar", "nikhil");
		int d=sum();
		System.out.println(d);
		int c=sum(10, 20);
		System.out.println(c);
	}
}
