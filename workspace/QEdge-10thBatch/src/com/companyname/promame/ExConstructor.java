package com.companyname.promame;

public class ExConstructor {

	public ExConstructor(){
		System.out.println("normal constructor");
	}
	
	public ExConstructor(int no,String name2){
		this(); 
		System.out.println(no);
		System.out.println(name2);
	}
	
	public static void main(String[] args) {
		//ExConstructor e1=new ExConstructor();
		ExConstructor e2=new ExConstructor(1, "sanchit");

	}
}
