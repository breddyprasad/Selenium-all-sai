package package2;

public class Student1 {
	
	public static void main(String a[]){
		Students s1 = new Students("n1", 1 , "IT");
		System.out.println(s1.getName());
		System.out.println(s1.getRno());
		System.out.println(Students.getCollege());
	}
}
