package com.qedge.java;

public class MethodOverloading {

	public static void sum(){
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sum(double a, double b){
		double c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		sum();
		sum(20, 30);
		sum(10.5,9.5);
	}
}
