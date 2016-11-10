package session1;

public class StringExample {
	public static void main(String a[]){
		String s = "Welcome to bangalore";


		String s1 = "welcome to bangalore...";
		
		System.out.println(s.equalsIgnoreCase(s1));
		s.compareTo(s1);
		s.charAt(1);
		s.length();
		s.trim();
		s.contains(s1);
		System.out.println(s.indexOf("o", 8));
		s.isEmpty();
		String [] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		for(String s2 : arr){
			System.out.println("for each -> "+s2);
		}
		
		s.substring(10,15);
		char[] ch = s.toCharArray();
		//reverse order
		for (int j=ch.length-1; j>=0; j--){
			System.out.println(ch[j]);
		}
			
		}
		
	}

