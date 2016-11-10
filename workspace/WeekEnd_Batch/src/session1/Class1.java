package session1;

public class Class1 {
	protected int i = 20;
	public static void main(String arg[]){
		int i = 10;
		int j;
		j = i;
		double d = 20.30;
		System.out.println("Welcome..."+ i);
		double d1 = add(i,d);
		System.out.println("after add method..."+d1);
	}

	public static double add(int j, double d){
		double var = j + d;
		System.out.println("add Method..."+var);
		return var;
	}
}
