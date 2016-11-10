package com.companyname.promame;

public class VariousMethods {
	
	// method with out parameters with out return type
	public static void sum(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//method with parameters with out return type
	public static void sum1(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	//method with out parameters and with return type
	public static int sum2(){
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//method with parameters and return type
	
	public static int sum3(int a,int b){
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		sum();
		sum1(30,40);
		int s=sum2();
		System.out.println(s);
		int t=sum3(50, 40);
		System.out.println(t);
				
	}
}
