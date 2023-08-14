package com.finzly.looping.series.usingdowhile;
//1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.

public class Sol1 {
	public static void main(String[] args) {

		int i = 2;
		do {
			System.out.print(i + " ");
			i += 2;
		} while (i <= 20);
	}
}
