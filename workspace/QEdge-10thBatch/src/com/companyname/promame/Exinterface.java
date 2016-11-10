package com.companyname.promame;

interface Hide{
	
	public void think();
	
	public void listen();
		
}

interface Unhide {
	 
	public void speak();
}

interface Visible extends Hide,Unhide {
	
	public void behaviour();
}



public class Exinterface implements Visible {

	
	public void think() {
		System.out.println("think carefully");
		
	}

	
	public void listen() {
		System.out.println("listen clearly");
		
	}

	public void speak() {
		System.out.println("don't disturb others");
		
	}

	public void behaviour() {
		System.out.println("behave wise");
		
	}
	
	public static void main(String[] args) {
		Exinterface e1=new Exinterface();
		e1.behaviour();
		e1.speak();
		e1.listen();
		e1.think();
	}

}
