package com.finzly.looping.series.usingfor;
//3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.

public class Sol3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			} else {
				System.out.print(-i + " ");
			}

		}

	}
}
