package com.comname.proname.java;

public class ExampleConstructor {

	public  ExampleConstructor(){
		System.out.println("constructor method");
	}
	
	public ExampleConstructor(String name1, String name2){
		this();
		System.out.println(name1);
		System.out.println(name2);
	}
	
	public static void main(String[] args) {
		ExampleConstructor ec1=new ExampleConstructor();
		ExampleConstructor ec2=new ExampleConstructor("anand", "karthik");
	}
}
