package com.comname.proname.java;
class GrandFather{
	static String Property5="Fields";
	static int debit=10000;
}

class Father extends GrandFather {
	static String Property3="house";
	static String Property4="plot";
}

public class Son extends Father{
	static String Property="job";
	static String Property2="appartment";
	public static void main(String[] args) {
		System.out.println(Property);
		System.out.println(Property2);
		System.out.println(Property3);
		System.out.println(Property4);
		System.out.println(Property5);
		System.out.println(debit);
	}
	
	
}
