package com.comname.proname.java;

class Batch2{
	
}
class Batch{
	public static void strength(int no){
		System.out.println("total no. of students are" +no);
	}
	public static void subject(){
		System.out.println("I am teaching java today");
	}
}
public class MethodOverRiding extends Batch {
	public static void strength(int no){
		System.out.println("total no. of Boys are" +no);

	}
	public static void main(String[] args) {
	strength(5);
	subject();
	}
	
}
