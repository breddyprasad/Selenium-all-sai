package com.qedge.java;
class Sample1{
	public static  void display(){
		System.out.println("This is from Sample Class");
	}
}
public class ExFinal extends Sample1{
  final static String name="mounika";
  
  public static void display(){
	
	  System.out.println(name);
  }
  
  
  
  public static void main(String[] args) {
	ExFinal e1=new ExFinal();
	display();
}
  
}
