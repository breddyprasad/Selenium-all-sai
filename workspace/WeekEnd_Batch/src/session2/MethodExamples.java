package session2;

import java.util.ArrayList;

public class MethodExamples {
	public static void main(String a[]){
		add();
		int i = sub(10, 20);
		int k =3;
		int j = 7;
		sub(k,j);
		ArrayList<String> al = methodName();
	}
	
	public static void add(){
		int i = 10;
		int j = 12;
		System.out.println(i+j);
	}
	
	public static void add(int i, int j){
		System.out.println(i+j);
	}
	public static int sub(int i, int j){
		return i-j;
	}
	public static ArrayList methodName(){
		ArrayList<String> al = new ArrayList();
		
		return al;
		
	}
}
