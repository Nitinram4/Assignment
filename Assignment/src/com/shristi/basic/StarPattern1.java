package com.shristi.basic;

public class StarPattern1 {
	public static void main(String[] args) {
		int x =4;
		int i =x-1;
        while (i>0) {
            int j=0;
            while (j<i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j<(x-i)) {
                System.out.print("*");
                j++;
            }
            j=0;
            while (j<(x-i)-1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
	}
}
