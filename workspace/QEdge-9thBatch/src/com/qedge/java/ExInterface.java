package com.qedge.java;

interface Student{
	public void subjects();
	
	public void marks();
}

interface Curiculum {
	public void sports();
	
	public void yoga();
}

interface Competition extends Curiculum,Student{
	public void nationalLevel();
}

public class ExInterface implements Competition{
	
	public void subjects() {
		System.out.println("7 subjects");
	}

	public void marks() {
		System.out.println("100 marks");
	}

	public void sports() {
		System.out.println("3 sports");
	}
	
	public void yoga() {
		System.out.println("daily morning");
	}

	public void nationalLevel() {
		System.out.println("one national level");
	}
	public static void main(String[] args) {
		ExInterface e1=new ExInterface();
		e1.marks();
		e1.subjects();
		e1.sports();
		e1.yoga();
		e1.nationalLevel();
	
		
	}

}
