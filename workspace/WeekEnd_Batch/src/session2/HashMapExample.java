package session2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap();
		hm.put("K1", "Welcome");
		hm.put("k2", "To");
		hm.put("k3", "Blr");
		System.out.println(hm.get("k3"));
		hm.put("k3", "Java");
		System.out.println(hm.get("k3"));
		hm.put("", "value");
		
		Set<Entry<String, String>>entry = hm.entrySet();
		for(Entry<String, String> e: entry){
			System.out.println("Key => "+e.getKey()+", Value => "+e.getValue());
		}
		Set<String> keys = hm.keySet();
		for(String k: keys){
			System.out.println("Key => "+k+", Value => "+hm.get(k));
		}
		
	}
}
