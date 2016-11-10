package com.companyname.promame;

abstract class Example{
	
	public abstract void create();
	
	public abstract void modify();
	
	public void delete(){
		System.out.println("this method is to delete");
	}
	
	public static void possible(){
		System.out.println("this method is used to verify static methods are created or not");
	}
}

public class ExAbstract extends Example{

	
	public void create() {
		System.out.println("this method is to create");
		
	}

	
	public void modify() {
		System.out.println("this method is to modify");
		
	}
	
	public static void main(String[] args) {
		
		ExAbstract e1=new ExAbstract();
		e1.create();
		e1.modify();
		e1.delete();
		possible();
	}

	

}
