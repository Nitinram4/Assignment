package com.shristi.basic;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
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
		arr[9] = 4;
		
		int ans=0;
		List<Integer> ls = new ArrayList<>();
		for(int i: arr) {
			if(ls.contains(i)) ans++;
			else ls.add(i);
		}
		System.out.println(ans);
	}
}
