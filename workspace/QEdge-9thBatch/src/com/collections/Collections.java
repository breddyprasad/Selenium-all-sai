package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections {
public static void arrayList() {
	ArrayList<String> al=new ArrayList<>();
	al.add("renuka");
	al.add("arshad");
	al.add("mounica");
	al.add("nikhil");
	al.add("sreedhar");
	al.add(1, "sreedhar");
	
	int size=al.size();
	/*for (int i = 0; i < size; i++) {
		System.out.println(al.get(i));	
	}*/
	Iterator<String> ie=al.iterator();
	while(ie.hasNext()){
		System.out.println(ie.next());
	}
	}
	public static void linkedList(){
		LinkedList<String> al2=new LinkedList<>();
		al2.add("renuka");
		al2.add("arshad");
		al2.add("mounica");
		al2.add("nikhil");
		al2.add("sreedhar");
		al2.add(1, "sreedhar");
		//al2.remove(1);
		Iterator<String> ie2=al2.iterator();
		while(ie2.hasNext()){
			System.out.println(ie2.next());
		}
	}
	
	public static void hasSet(){
		HashSet<String> al3= new HashSet<>();
		al3.add("arshad");
		al3.add("mounica");
		al3.add("renuka");
		al3.add("nikhil");
		al3.add("sreedhar");
		al3.add("sreedhar");
		//al2.remove(1);
		Iterator<String> ie3=al3.iterator();
		while(ie3.hasNext()){
			System.out.println(ie3.next());
		}
	}
	public static void linkedhasSet(){
		LinkedHashSet<String> al4= new LinkedHashSet<>();
		al4.add("arshad");
		al4.add("mounica");
		al4.add("renuka");
		al4.add("nikhil");
		al4.add("sreedhar");
		al4.add("sreedhar");
		//al2.remove(1);
		Iterator<String> ie4=al4.iterator();
		while(ie4.hasNext()){
			System.out.println(ie4.next());
		}
	}
	
	public static void treeSet(){
		TreeSet<String> al4= new TreeSet<>();
		al4.add("arshad");
		al4.add("mounica");
		al4.add("renuka");
		al4.add("nikhil");
		al4.add("sreedhar");
		al4.add("sreedhar");
		//al2.remove(1);
		Iterator<String> ie4=al4.iterator();
		while(ie4.hasNext()){
			System.out.println(ie4.next());
		}
	}
	public static void main(String[] args) {
		hasSet();
		linkedhasSet();
		treeSet();
	}
}
