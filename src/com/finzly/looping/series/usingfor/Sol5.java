package com.finzly.looping.series.usingfor;
//5) Generate the Series... 1 10 100 1000.

public class Sol5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i *= 10) {
			System.out.print(i + " ");
		}
	}
}
