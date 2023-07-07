package com.shristi.basic;

public class Factorial {
	public static void main(String[] args) {
		int x = 4;
		int ans=1;
		while(x!=1) {
			ans *= x;
			x--;
		}
		System.out.println(ans);
	}
}
