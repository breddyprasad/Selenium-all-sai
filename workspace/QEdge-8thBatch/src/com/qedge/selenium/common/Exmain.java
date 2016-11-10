package com.qedge.selenium.common;
class Child{
	int b=20;
	
}
public class Exmain extends Child {
int a=10;
public static void main(String[] args) {
	Exmain e1=new Exmain();
	System.out.println(e1.a);
	System.out.println(e1.b);
}

}
