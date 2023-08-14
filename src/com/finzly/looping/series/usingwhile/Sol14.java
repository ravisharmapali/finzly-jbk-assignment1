package com.finzly.looping.series.usingwhile;
//14) Generate the Series... 1 2 3 4 5 4 3 2 1. 

public class Sol14 {
	public static void main(String[] args) {
		
		int i=1;
		while(i<5) {
			System.out.print(i+" ");
			i++;
		}
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
	}
}
