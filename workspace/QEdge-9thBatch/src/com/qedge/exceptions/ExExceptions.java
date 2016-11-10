package com.qedge.exceptions;

import javax.xml.bind.ParseConversionEvent;

public class ExExceptions {
public static void arithmeticException() {
	
	try {
		int a=1;
		int b=0;
		int c=a/b;
		System.out.println(c);
	} catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println("arithmetic Exception");
	}
	
}

public static void nullPointerException(){
	
	try {
		String name=null;
		System.out.println(name.length());
	} catch (NullPointerException e) {
		System.out.println(e);
		System.out.println("Null pointer Exception");
	}
}

public static void numberFormatException(){
	try {
		String s="abc";
		int i=Integer.parseInt(s);
		System.out.println(i);
	} catch (NumberFormatException e) {
		System.out.println(e);
		System.out.println("Number Format Exception");
	}
}

public static void GeneralException(){
	try {
		String s="abc";
		int i=Integer.parseInt(s);
		System.out.println(i);
	} catch (Exception e) {
		System.out.println(e);
		System.out.println("Exception");
	}
}

public static void tryandMultiCatch(){
	try {
		String s="abc";
		int i=Integer.parseInt(s);
		System.out.println(i);
	} catch(ArithmeticException e){
		System.out.println(e);
	} catch(NullPointerException e){
		System.out.println(e);
	} catch (NumberFormatException e) {
		System.out.println(e);
	}
}

public static void tryAndFinally(){
	try {
		String s=null;
		System.out.println(s.length());
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		System.out.println("always finally block will be executed");
	}
}
public static void main(String[] args) {
	tryAndFinally();
}
}
