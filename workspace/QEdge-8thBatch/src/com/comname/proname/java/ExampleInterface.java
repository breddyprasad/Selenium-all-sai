package com.comname.proname.java;
interface Example{
	
	public void m5();
	
	public void m6();
	
	
}

interface Example_1 {
	
	public void m7();
}

interface Example_2 extends Example,Example_1{
	public void m8();
}
public class ExampleInterface implements Example_2{
	public void m5() {
		System.out.println("method m5");
		
	}
	public void m6() {
		System.out.println("method m6");
		
	}
	public static void main(String[] args) {
		ExampleInterface i1=new ExampleInterface();
		i1.m5();
		i1.m6();
		i1.m7();
		i1.m8();
	}
	
	public void m7() {
		System.out.println("method m7");
		
	}
	
	public void m8() {
		System.out.println("method m8");
		
	}

}
