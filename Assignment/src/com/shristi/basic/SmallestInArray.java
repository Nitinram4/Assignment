package com.shristi.basic;

public class SmallestInArray {
	public static void main(String[] aa) {
		int[] arr = new int[10];
		arr[0] = 50;
		arr[1] = 30;
		arr[2] = 60;
		arr[3] = 20;
		arr[4] = 540;
		arr[5] = 17;
		arr[6] = 4;
		arr[7] = 50;
		arr[8] = 670;
		arr[9] = 103;
		
		int min = Integer.MAX_VALUE;
		for(int i: arr) {
			min = Math.min(min, i);
		}
		System.out.println(min);
	}
}
