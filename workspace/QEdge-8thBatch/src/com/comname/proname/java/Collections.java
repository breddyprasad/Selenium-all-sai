package com.comname.proname.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("anil");
	al.add("jyothi");
	al.add("rutu");
	al.add("usha");
	al.add("subrat");
	al.add(2,"anand");
	al.add("subrat");
	
	Iterator<String> ie=al.iterator();
	
	while(ie.hasNext()){
		System.out.println(ie.next());
	}
	
	LinkedList<String> al2=new LinkedList<>();
	al2.add("anil");
	al2.add("jyothi");
	al2.add("rutu");
	al2.add("usha");
	al2.add("subrat");
	al2.add(2,"anand");
	al2.add("subrat");
	
Iterator<String> ie2=al2.iterator();
	
	while(ie2.hasNext()){
		System.out.println(ie2.next());
	}
}
}
