package session2;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListExample {
	public static void main(String arg[]){
		ArrayList<String> al = new ArrayList<>();
		al.add("Bangalore");
		al.add("Welcomes");
		al.get(1);
		al.indexOf("Welcome");
		al.contains("Bangalore");
		al.add(1, "to");
		
		Iterator i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		al.remove(1);
		System.out.println(al.get(1));
	}
}
