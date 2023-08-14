package com.finzly.looping.series.usingdowhile;
//4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.

public class Sol4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(i * 5 + " ");
			i++;
		} while (i <= 10);
	}
}
