package package1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {
	public static void main(String args[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("k1", "Bangalore");
		hm.put("k2", "Java");
		hm.put("", "Welcome");
		System.out.println(hm.get("k2"));
		hm.put("k2", "Value");
		System.out.println(hm.get("k2"));
		System.out.println(hm.get(""));
		
		Set<Entry<String, String>>s = hm.entrySet();
		
		for(Entry<String, String>e:s){
			System.out.println("Key => "+e.getKey()+", Value => "+e.getValue());
		}
		
		Set<String> keys = hm.keySet();
		for(String k:keys){
			System.out.println("Key => "+k+", Value => "+hm.get(k));
		}
	}
}
