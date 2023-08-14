package com.finzly.looping.series.usingdowhile;
//9) Generate the series... 1 4 9 16 25 36 49 64 81 100.

public class Sol9 {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(i * i + " ");
			i++;
		} while (i <= 10);
	}
}
