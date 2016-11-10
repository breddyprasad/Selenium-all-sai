package com.companyname.promame;

public class Arrays {

	public static void main(String[] args) {
		int a[]={1,2,23,45};
		/*int size=a.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			
			System.out.println(a[i]);
		
		}*/
		
		int b[][]={{5,7,8,9},{12,13,14,15},{21,22,23,24}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
	
	}
}
