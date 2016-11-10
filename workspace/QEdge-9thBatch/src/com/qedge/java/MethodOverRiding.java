package com.qedge.java;

class Sample{
	public void read(){
		System.out.println("this is read method");
	}
	
	public void write(){
		System.out.println("this is write method");
	}
}
public class MethodOverRiding extends Sample{
	public  void read(){
		System.out.println("override read method");
	}
	public static void main(String[] args) {
	MethodOverRiding m1=new MethodOverRiding();
	m1.read();
	m1.write();
	}
	
}
