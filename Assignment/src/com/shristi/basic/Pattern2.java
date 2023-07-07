package com.shristi.basic;

public class Pattern2 {
	public static void main(String[] aa) {
		int hei = 4;
		int j=0;
		int z=0;
		while(hei!=0) {
			z++;
			for(int i=0;i<z;i++) {
				j++;
				System.out.print(j);
			}
			System.out.println();
			hei--;
		}
	}
}
