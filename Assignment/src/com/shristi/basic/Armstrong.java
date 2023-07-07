package com.shristi.basic;

public class Armstrong {
	public static boolean isArmstrong(int x) {
		
		int tmp = x;
		int dig=0;
		while(tmp!=0) {
			dig++;
			tmp/=10;
		}
		
		int sum=0;
		tmp = x;
		while(tmp!=0) {
			int n = tmp%10;
			sum+= Math.pow(n, dig);
			tmp/=10;
		}
		
		return sum==x;
	}
	
	public static void main(String[] args) {
		int x = 152;
		System.out.println(x+" is armstrong number : "+ isArmstrong(x));
	}
}
