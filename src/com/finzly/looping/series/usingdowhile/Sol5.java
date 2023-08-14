package com.finzly.looping.series.usingdowhile;
//5) Generate the Series... 1 10 100 1000.

public class Sol5 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(i+" ");
			i *= 10;
		} while (i <= 1000);
	}
}
