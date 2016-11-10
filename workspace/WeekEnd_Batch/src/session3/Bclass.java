package session3;

public class Bclass {
	
	public static void main(String ar[]){
		Aclass a = new Aclass();
		a.setName("xyz");
		a.getName();
	}
	
	public void add(int i, int j){
		System.out.println("super class method");
	}
	
	public int add(int i, double j){
		
		return i;
		
	}

}
