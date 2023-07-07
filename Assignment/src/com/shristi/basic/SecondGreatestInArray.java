package com.shristi.basic;

public class SecondGreatestInArray {
	public static void main(String[] aa) {
		int[] arr = new int[10];
		arr[0] = 50;
		arr[1] = 30;
		arr[2] = 60;
		arr[3] = 20;
		arr[4] = 669;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 50;
		arr[8] = 670;
		arr[9] = 103;

		int max = Integer.MIN_VALUE;
		int max2 = 0;
		for (int i : arr) {
			if (max < i) {
				max2 = max;
				max = i;
			}
		}
		System.out.println(max2);
	}
}
