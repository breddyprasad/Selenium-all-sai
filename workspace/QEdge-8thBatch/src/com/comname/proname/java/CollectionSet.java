package com.comname.proname.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {
public static void main(String[] args) {
	HashSet<String> al=new HashSet<>();
	al.add("anil");
	al.add("jyothi");
	al.add("rutu");
	al.add("latha");
	al.add("usha");
	al.add("anand");
	al.add("subrat");
	al.add("anil");
	
	Iterator<String> ie=al.iterator();
	while(ie.hasNext()){
		System.out.println(ie.next());
	}
	
	LinkedHashSet<String> al2=new LinkedHashSet<>();
	al2.add("anil");
	al2.add("jyothi");
	al2.add("rutu");
	al2.add("latha");
	al2.add("usha");
	al2.add("anand");
	al2.add("subrat");
	al2.add("anil");
	
	Iterator<String> ie2=al2.iterator();
	while(ie2.hasNext()){
		System.out.println(ie2.next());
	}
	
	
	TreeSet<String> al3=new TreeSet<>();
	al3.add("anil");
	al3.add("jyothi");
	al3.add("rutu");
	al3.add("latha");
	al3.add("usha");
	al3.add("anand");
	al3.add("subrat");
	al3.add("anil");
	
	Iterator<String> ie3=al3.iterator();
	while(ie3.hasNext()){
		System.out.println(ie3.next());
	}
}
	
}
