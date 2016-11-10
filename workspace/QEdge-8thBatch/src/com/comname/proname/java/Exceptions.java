package com.comname.proname.java;

public class Exceptions {
public static void arithmeticException() {
	int a=5;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);
	} catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println("arithmetic exception");
	}
}

public static void nullPointerException(){
	String name=null;
	try {
		
		System.out.println(name.length());
	} catch (NullPointerException e) {
		System.out.println(e);
		System.out.println("null pointer exception");
	}
	
}

public static void numberFormatException(){
	String name="abc";
	
	try {
		int s=Integer.parseInt(name);
		System.out.println(s);
	} catch (NumberFormatException e) {
		System.out.println(e);
		System.out.println("number format exception");
	}
	
}

public static void tryandMultiCatch(){
	String name="jyothi";
	try {
		System.out.println(name.length());
	} catch (ArithmeticException e) {
		// TODO: handle exception
	} catch (NumberFormatException e) {
		// TODO: handle exception
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		System.out.println("always finally block will execute");
	}
	
}


public static void main(String[] args) {
	tryandMultiCatch();
}
}
