package com.finzly.looping.series.usingfor;

//6) Generate the Series... 1  3  6  10  15  21  28  36  45.   

public class Sol6 {
	public static void main(String[] args) {

		for (int i = 0, j= 1; i <= 8; i++) {
			System.out.print((2*i+j)+ " ");
			j=i+j;
		}
			
	}
}