package com.qedge.java;
abstract class Bike{
public void engine(){
	System.out.println("with out engine bike is not running");
}

public abstract void brake();

}

public class ExAbstract extends Bike{

	
	public void brake() {
		System.out.println("Brakes are very important to control");
		
	}
	
	public static void main(String[] args) {
		ExAbstract e1=new ExAbstract();
		e1.brake();
		e1.engine();
	}

}
