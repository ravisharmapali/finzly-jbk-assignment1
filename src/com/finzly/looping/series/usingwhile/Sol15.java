package com.finzly.looping.series.usingwhile;

//15) Generate the Series... 6 12 18 24 30 36 42 48 54 60.
public class Sol15 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(6 * i + " ");
			i++;
		}
	}
}
