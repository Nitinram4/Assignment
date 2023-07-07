package com.shristi.basic;

public class SortArray {
	public static void main(String[] arga) {
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
		
		
		int i=1;
		int j=1;
		while(arr.length-i!=0) {
			j=0;
			int z=1;
			while(j<arr.length-i) {
				if(arr[z]<arr[j]) {
					int tmp = arr[z];
					arr[z] = arr[j];
					arr[j] = tmp;
				}
				z++;
				j++;
			}
			i++;
		}
		for(int z: arr) System.out.println(z);
		
		
	}
}
