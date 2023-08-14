package com.finzly.looping.series.usingdowhile;
//6) Generate the Series... 1  3  6  10  15  21  28  36  45.   

public class Sol6 {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		do {
			System.out.print(2 * i + j + " ");
			j += i;
			i++;
		} while (i <= 8);
	}
}
