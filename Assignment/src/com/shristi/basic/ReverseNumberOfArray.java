package com.shristi.basic;

public class ReverseNumberOfArray {
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

		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}

		for(int val:arr) System.out.println(val);
	}
}
