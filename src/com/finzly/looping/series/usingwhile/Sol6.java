package com.finzly.looping.series.usingwhile;
///6) Generate the Series... 1  3  6  10  15  21  28  36  45.   

public class Sol6 {
	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		while (i <= 8) {
			System.out.print(2 * i + j + " ");
			j += i;
			i++;
		}
	}
}