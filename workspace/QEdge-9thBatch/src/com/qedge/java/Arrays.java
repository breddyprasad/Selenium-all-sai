package com.qedge.java;

public class Arrays {
public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	int size=a.length;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	int b[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
		
	}
}
}
