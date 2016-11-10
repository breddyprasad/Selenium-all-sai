package session2;

public class Students {
	public static void main(String a[]){
		StudentDetails s1 = new StudentDetails("Amit", 1);
		StudentDetails s2 = new StudentDetails("Akash", 2);
		System.out.println(s1.getName()+" -> "+s1.getRno());
		System.out.println(s2.getName()+" -> "+s2.getRno());
	}
}
