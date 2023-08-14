package com.finzly.looping.series.usingwhile;
//5) Generate the Series... 1 10 100 1000.

public class Sol5 {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 1000) {
			System.out.print(i+" ");
			i *= 10;
		}
	}
}
