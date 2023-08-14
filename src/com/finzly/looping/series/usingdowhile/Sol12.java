package com.finzly.looping.series.usingdowhile;
//12) Generate the Series... 4 8 12 16 20 24 28 32 36 40. 

public class Sol12 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(4 * i + " ");
			i++;
		} while (i <= 10);
	}
}
