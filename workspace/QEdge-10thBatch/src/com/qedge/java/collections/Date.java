package com.qedge.java.collections;

import java.text.SimpleDateFormat;
import java.util.Formatter;

public class Date {

	public static void main(String[] args) {
		java.util.Date d1=new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(d1);    
		System.out.println(strDate);
	}
}
