package com.companyname.promame;

public class MethodOverLoading {

	public static void sum(){
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b, int c){
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void sum(String name){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		sum();
		sum(30, 20);
		sum(60, 20, 40);
		sum("sai");
	}
}
