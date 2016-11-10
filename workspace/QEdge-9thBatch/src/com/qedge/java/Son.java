package com.qedge.java;

class GrandFather{
	static String property5="fields";
	static String property6="Gold";
}

class Father extends GrandFather{
	static String property1="house";
	static String property2="shop";
}


public class Son extends Father{
	static String property3="job";
	static String property4="appartment";
	public static void main(String[] args) {
		System.out.println(property3);
		System.out.println(property4);
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property5);
		System.out.println(property6);
		
		
	}
}
