package com.finzly.looping.series.usingdowhile;
//13) Generate the Series... 10 20 30 40 50 60 70 80 90 100. 

public class Sol13 {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.print(10*i+" ");
			i++;
		}while(i<=10);
	}
}
