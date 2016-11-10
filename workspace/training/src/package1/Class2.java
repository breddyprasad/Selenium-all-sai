package package1;

public class Class2 {
	
	public static void main(String args[]){
		
		String s = "B ng lore";
		String s1 = "bangalore";
		System.out.println(s.charAt(5));
		s.length();
		s.equals(s1);
		s.equalsIgnoreCase(s1);
		s.trim();
		s.compareTo(s1);
		s.compareToIgnoreCase(s1);
		s.concat(s1);
		s.contains(s1);
		s.indexOf('a');
		s.lastIndexOf('a');
		String subString = s.substring(5,7);
		System.out.println(subString);
		s.isEmpty();
		s.toCharArray();
		String a[] = s.split("a");
		int i = 20;
		int j = 23;
		
		for (int ii=0;ii<10;ii++)
			System.out.println(ii);
		
		System.out.println("preincrement  ");
		for (int jj=0;jj<10;++jj)
			System.out.println(jj);
	}

}
