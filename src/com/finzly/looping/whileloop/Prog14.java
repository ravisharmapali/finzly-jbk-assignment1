package com.finzly.looping.whileloop;
//14) Write a Program To print count of even No 1 to 25 no.

public class Prog14 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (i <= 25) {
			if (i % 2 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("count of even 1 to 25 is "+count);
	}
}
