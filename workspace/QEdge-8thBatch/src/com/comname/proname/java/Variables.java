package com.comname.proname.java;

public class Variables {
	 int a=10; //instance variable
	 static int b=20;  //static variable
public static void main(String[] args) {
	int c=30; //local variable
	//ClassName objName =new ClassName();
	Variables v1=new Variables();
	System.out.println(v1.a);
	System.out.println(b);
	System.out.println(c);
}
}