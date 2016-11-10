package package1;

public class Class1 {
	public String s = "Welcome to Bangalore";
	public static String s1 = "Java";
	
	public static void main(String arg[]){
		System.out.println("Java programs...");
		add();
	}

	public static void add(){
		int i =20;
		int j = 15;
		int k;
		
		k = i + j;
		System.out.println("k Value => "+k);
		int ij = sub();
		System.out.println(ij);
	}
	
	public static int sub(){
		int i =20;
		int j = 15;
		int k;
		
		k = i + j;
		System.out.println("k Value => "+k);
		System.out.println(i+j);
		return k;
	}
	
}
