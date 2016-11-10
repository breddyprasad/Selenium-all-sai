package session2;

public class Class2 {
	public static void main(String a[]){
		/*Class1 c1 = new Class1();
		c1.add();*/
		String s = "Welcome to Bangalore";
		String s1 = "Java";
		
		s.equals(s1);
		s.equalsIgnoreCase(s1);
		s.length();
		System.out.println(s.charAt(5));
		s.trim();
		s.compareToIgnoreCase(s1);
		s.contains(s1);
		s.indexOf('t');
		char [] c = s.toCharArray();
		String [] var = s.split("to");
		System.out.println(var[0].trim());
		System.out.println(var[1].trim());
		//System.out.println(var[2]);
		
		
				
	}

}
