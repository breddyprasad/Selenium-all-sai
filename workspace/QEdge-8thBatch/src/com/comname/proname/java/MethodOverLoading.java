package com.comname.proname.java;

public class MethodOverLoading {
public static void sum(){
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}

public static void sum(int a, int b){
	int c=a+b;
	System.out.println(c);
}

public static void sum(int a, int b, int c){
	int d=a+b+c;
	System.out.println(d);
}

public static void sum(String name){
	System.out.println(name);
}

public static void main(String[] args) {
	sum();
	sum(10, 20, 30);
	sum(20,50);
	sum("anand");
}
}
