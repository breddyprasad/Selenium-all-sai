package package2;

public class Students {
	public String name;
	public int rno;
	public String branch;
	public static String college = "BITS";
	
	public Students(String name, int r, String branch){
		this.name = name;
		this.rno = r;
		this.branch = branch;
	}
	
	public String getName(){
		return name;
	}
	public int getRno(){
		return rno;
	}
	public static String getCollege(){
		return college;
	}
}
