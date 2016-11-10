package session2;

public class StudentDetails {
	public String name;
	public int rno;
	public static String college = "BIT";
	
	public StudentDetails(String name, int rno) {
		
		this.name = name;
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public int getRno() {
		return rno;
	}

	public static String getCollege() {
		return college;
	}
	
	
	
	

}
