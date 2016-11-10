package com.companyname.promame;

class GrandFather{
	static String property5="lands";
	static String property6="mills";
}

class Father extends GrandFather{
	static String property3="Business";
	static String property4="House";
}


public class Son extends Father{

	static String property1="software job";
	static String property2="part time job";
	public static void main(String[] args) {
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property3);
		System.out.println(property4);
		System.out.println(property5);
		System.out.println(property6);
		
	}
}
