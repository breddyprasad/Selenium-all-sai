package com.comname.proname.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleDate {
public static void dateWithOutFormat() {
	Date d1=new Date();
	System.out.println(d1);
}

public static void dateFormat(){
	 Date date = new Date();  
	 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	 String strDate= formatter.format(date);  
	 System.out.println(strDate);  
}

public static void main(String[] args) {
	dateFormat();
}
}
