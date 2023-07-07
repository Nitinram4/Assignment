package com.shristi.basic;

public class ReverseNumber {
	public static void main(String[] arga) {
		int num = 1948;
		int ans=0;
		while(num!=0) {
			ans= ans*10 + (num%10);
			num/=10;
		}
		System.out.println(ans);
	}

}
