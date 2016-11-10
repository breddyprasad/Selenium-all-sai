package package1;

public class Class1 {
 static int i = 20;
 int j = 30;
	public static void main(String[] args) {
		System.out.println("Welcome to Java...");
		
		int i = 10;
		double j;
		int returnValue = add(i, 40);
		System.out.println("return Value == "+ returnValue);
		System.out.println("add method completed..");
		
	}

	private static int add(int a, int b){
		System.out.println("i value = "+(i+15));
		System.out.println("i = "+i);
		
		System.out.println("sub method completed..");
		return a+b;
	}
	
	public  void sub(){
		System.out.println("sub method call..");
		add(5,20);
	}
}
