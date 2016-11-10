package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String a[]){
		ArrayList<String> al = new ArrayList<>();
		al.add("Welcome");
		al.add("to");
		al.add("java");
		al.add("blr");
		
		for(String s:al){
			System.out.println("using for-each ==>> "+s);
		}
		
		Iterator i = al.iterator();
		while(i.hasNext()){
			System.out.println("using iterator ==>> "+i.next());
		}
		
		for(int j = al.size()-1; j >= 0; j--){
			System.out.println("reverse order ==>> "+al.get(j));
		}
		
		String s = "Welcome to java";
	}
}
