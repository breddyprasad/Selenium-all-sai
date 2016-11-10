package com.qedge.java;

public class Variables {

	int a=10; //instance variable
	static int b=20;  //static variable
	public static void main(String[] args) {
		int c=30;  //local variable
		System.out.println(c);
		System.out.println(b);
		//Classname obj=new Classname
		Variables v1=new Variables();
		System.out.println(v1.a);
	}
}
