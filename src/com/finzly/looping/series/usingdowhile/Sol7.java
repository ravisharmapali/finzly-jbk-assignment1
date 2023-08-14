package com.finzly.looping.series.usingdowhile;
//7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.

public class Sol7 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(8 * i + " ");
			i++;
		} while (i <= 10);
	}
}
