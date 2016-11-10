package session3;

public class Cclass extends Bclass {
	
	public void add(int i, int j){
		
		System.out.println("child class method");
	}
	public static void main(String arg[]){
		Bclass c =  new Cclass();
		c.add(5, 2);
	}
}
