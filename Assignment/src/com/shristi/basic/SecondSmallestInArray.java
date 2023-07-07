package com.shristi.basic;

public class SecondSmallestInArray {
	public static void main(String[] args) {

		int[] arr = new int[10];
		arr[0] = 50;
		arr[1] = 30;
		arr[2] = 60;
		arr[3] = 20;
		arr[4] = 540;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 50;
		arr[8] = 670;
		arr[9] = 103;
		
		int min = Integer.MAX_VALUE;
		int min2 = 0;
		for(int i:arr) {
			if(min>i) {
				min2 =min;
				min=i;
			}
		}
		System.out.println(min2);
		
	}
}
