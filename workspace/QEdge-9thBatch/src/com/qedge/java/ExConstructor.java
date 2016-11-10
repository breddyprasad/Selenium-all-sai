package com.qedge.java;

public class ExConstructor {

	public ExConstructor(){
		System.out.println("Hello Constructor");
	}
	
	public ExConstructor(String name1, String name2){
		this();
		System.out.println(name1);
		System.out.println(name2);
		
	}
	
	public static void main(String[] args) {
		//ExConstructor e1=new ExConstructor();
		ExConstructor e2=new ExConstructor("arshad","nikhil");
		
	}
	
}
