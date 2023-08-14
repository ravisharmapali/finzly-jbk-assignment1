package com.finzly.looping.series.usingwhile;
//2) Generate the Series... 9 18 27 36 45 54 63 72 81 90. 

public class Sol2 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i * 9 + " ");
			i++;
		}
	}
}
