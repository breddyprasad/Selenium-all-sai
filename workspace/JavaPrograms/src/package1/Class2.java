package package1;

public class Class2 {
	public static void main(String a[]){
		Class1 c = new Class1();
		
		String s = "";
		String s1 = "bangalore";
		s.charAt(5);
		boolean compare = s.equals(s1);
		s.equalsIgnoreCase(s1);
		System.out.println(compare);
		System.out.println(s.indexOf("o"));
		s.compareTo(s1);
		s.compareToIgnoreCase(s1);
		s.contains("lore");
		s.isEmpty();
		s.lastIndexOf("a");
		s.replaceAll("a", "xyz");
		String [] splitResult = s.split("a");
		char[] ch = s.toCharArray();
		String s2 = "20";
		int k = Integer.parseInt(s2);
		Double.parseDouble(s2);
		Float.parseFloat(s2);
		
		Integer in = 20;
		in.toString();
	}

}
