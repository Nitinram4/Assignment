package com.shristi.basic;

public class PerfectNumber {
	public static void main(String[] arga) {
		int x = 26;
		int i=1;
		int sum=0;
		while(i!=(x/2+1)) {
			sum += x%i==0?i:0;
			i++;
		}

		System.out.println(sum==x);
	}
}
