package com.finzly.looping.series.usingwhile;
//10) Generate the series... 3 6 9 12 15 18 21 24 27 30.

public class Sol10 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(3 * i + " ");
			i++;
		}
	}
}
