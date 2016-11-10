package com.comname.proname.java;

public class Arrays {
public static void main(String[] args) {
	int a[]={1,2,3,4};
	/*System.out.println(a.length);
	System.out.println(a[0]);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}*/
	
	int b[][]={{1,2,3,5},{4,5,6,7},{8,9,7,8}};
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(b[i][j]+" ");
			
		}
		
		System.out.println();
	}
}
}
