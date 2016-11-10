package com.companyname.promame;

class Sample{
	 
	public  static void read(String name){
		int a=40;
		int b=50;
		int c=a+b;
		System.out.println(c);
		System.out.println("This method is used to read");
	}
	
	public static void write(){
		System.out.println("This method is used to write");
	}
}



public class MethodOverRiding extends Sample{
	public static void read(String na){
		
		System.out.println("read method is over rided");
	}
	
  public static void main(String[] args) {


	write();
	read("pankaj");
}
}
