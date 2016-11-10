package com.companyname.promame;

abstract class Strength{
	
	public void talent(){
		System.out.println("show the talent");
	}
	
	public abstract void rescue();
	
}

public class ExAbstract2 extends Strength{

	
	public void rescue() {
		System.out.println("hide the rescue");
		
	}
	
	public static void main(String[] args) {
		ExAbstract2 e1=new ExAbstract2();
		e1.rescue();
		e1.talent();
	}

}
