package com.shristi.basic;

public class PrimeNumber {
	public static void main(String[] arga) {
		int x = 6;
		boolean ans = true;
		int i=2;
		while(i!=(x/2+1)) {
			if(x%i==0) {
				ans = false;
				break;
			}
			i++;
		}

		System.out.println(ans);
	}
}
