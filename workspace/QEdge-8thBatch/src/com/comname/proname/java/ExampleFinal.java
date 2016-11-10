package com.comname.proname.java;

class Sample2{
	public static void m1(){
		System.out.println("m1");
	}
}

public class ExampleFinal extends Sample2{
	public static void m1(){
		System.out.println("you are mistaken");
	}
	public static void main(String[] args) {
		m1();
	}
}
