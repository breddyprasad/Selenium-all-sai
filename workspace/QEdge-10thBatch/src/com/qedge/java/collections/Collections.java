package com.qedge.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections {
public static void arrayList() {
	ArrayList<String> al1=new ArrayList<>();
	al1.add("sanchit");
	al1.add("malli");
	al1.add("deepak");
	al1.add("jyothi");
	al1.add("subrat");
	al1.add("manasa");
	al1.add("Thanusri");
	al1.add("deepthi");
	al1.add(1, "schanvaz");
	al1.remove(1);
	//to find the size for array list
	/*int size=al1.size();
	for (int i = 0; i < size; i++) {
		String element=al1.get(i);
		System.out.println(element);
	}*/
	Iterator<String> ie1=al1.iterator();
	
	while(ie1.hasNext()){
		String element=ie1.next();
		System.out.println(element);
	}
	
}
	public static void linkedList(){
		
	LinkedList<String>al2=new LinkedList<>();
	al2.add("sanchit");
	al2.add("malli");
	al2.add("deepak");
	al2.add("jyothi");
	al2.add("subrat");
	al2.add("manasa");
	al2.add("Thanusri");
	al2.add("deepthi");
	al2.add(1, "schanvaz");
	al2.remove(1);
	//to find the size for array list
	/*int size=al1.size();
	for (int i = 0; i < size; i++) {
		String element=al1.get(i);
		System.out.println(element);
	}*/
	Iterator<String> ie2=al2.iterator();
	
	while(ie2.hasNext()){
		String element=ie2.next();
		System.out.println(element);
	}
	
	}
	
	public static void hasSet(){
		HashSet<String> al3=new HashSet<>();
		al3.add("sanchit");
		al3.add("deepthi");
		al3.add("gayathri");
		al3.add("amarnath");
		al3.add("schanvaz");
		al3.add("deepak");
		al3.add("deepak");
		al3.add("deepthi");
		
		Iterator<String> ie3=al3.iterator();
		
		while(ie3.hasNext()){
			System.out.println(ie3.next());
		}
		
	}
	public static void linkedhasSet(){
		LinkedHashSet<String> al3=new LinkedHashSet<>();
		al3.add("sanchit");
		al3.add("deepthi");
		al3.add("gayathri");
		al3.add("amarnath");
		al3.add("schanvaz");
		al3.add("deepak");
		al3.add("deepak");
		al3.add("deepthi");
		
		Iterator<String> ie3=al3.iterator();
		
		while(ie3.hasNext()){
			System.out.println(ie3.next());
		}
		
	}
	public static void treeSet(){
		TreeSet<String> al3=new TreeSet<>();
		al3.add("sanchit");
		al3.add("deepthi");
		al3.add("gayathri");
		al3.add("amarnath");
		al3.add("schanvaz");
		al3.add("deepak");
		al3.add("deepak");
		al3.add("deepthi");
		
		Iterator<String> ie3=al3.iterator();
		
		while(ie3.hasNext()){
			System.out.println(ie3.next());
		}
		
	}
	public static void main(String[] args) {
		
		treeSet();
	}


}
