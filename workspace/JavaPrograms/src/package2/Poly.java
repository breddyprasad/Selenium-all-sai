package package2;

public class Poly {
	public void add(int i, int j){
		System.out.println(i+j);
	}
	public void add(double i, int j){
		System.out.println(i+j);
	}
	public void add(int i, int j, int k){
		System.out.println(i+j+k);
	}
	
	public void sub(){
		add(5,6);
		add(5,6,7);
		add(9.0,8);
		
	}
}
