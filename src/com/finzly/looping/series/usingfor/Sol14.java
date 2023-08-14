package com.finzly.looping.series.usingfor;
//14) Generate the Series... 1 2 3 4 5 4 3 2 1. 

public class Sol14 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i < 5; i++) {
			System.out.print(i + " ");
		}
		for (; i >= 1; i--) {
			System.out.print(i + " ");

		}
	}
}
