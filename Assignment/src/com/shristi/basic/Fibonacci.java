package com.shristi.basic;

public class Fibonacci {
	public static void main(String[] aa) {
		
		int x = 10;
		
		int i =0;
		int j =1;
		while(x!=0) {
			System.out.println(i);
			int t = i;
			i=j;
			j=t+j;
			x--;
		}
		
		
	}
}
