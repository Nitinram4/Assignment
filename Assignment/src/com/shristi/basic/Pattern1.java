package com.shristi.basic;

public class Pattern1 {
	public static void main(String[] aa) {
		int hei = 4;
		int j=0;
		int z=0;
		while(hei!=0) {
			z++;
			j++;
			for(int i=0;i<z;i++) {
				System.out.print(j);
			}
			System.out.println();
			hei--;
		}
	}
}
