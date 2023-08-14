package com.finzly.looping.series.usingdowhile;
//11) Generate the Series... 7 14 21 28 35 42 49 56 63 70. 

public class Sol11 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(7 * i + " ");
			i++;
		} while (i <= 10);
	}
}
