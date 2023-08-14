package com.finzly.looping.series.usingfor;
//8) Generate the Series... 0 1 1 2 3 5 8 13 21.

public class Sol8 {
	public static void main(String[] args) {

		int p1 = 0;
		int p2 = 1;
		for (int i = 0; i <= 8; i++) {
			if (i == 0) {
				System.out.print(0 + " ");
			} else if (i == 1) {
				System.out.print(1 + " ");
			} else {
				int j = p1 + p2;
				System.out.print(j + " ");
				p1 = p2;
				p2 = j;
			}

		}

	}
}
