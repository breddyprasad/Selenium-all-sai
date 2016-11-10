package com.comname.proname.java;
abstract class Sample{
	public abstract void m1();
	
	public static void m2(){
		System.out.println("m2 method");
	}
}
public class ExampleAbstract extends Sample{

	
	public void m1() {
		System.out.println("m1 method");
		
	}
	
	public static void main(String[] args) {
		ExampleAbstract a1=new ExampleAbstract();
		a1.m1();
		m2();
	}

}
