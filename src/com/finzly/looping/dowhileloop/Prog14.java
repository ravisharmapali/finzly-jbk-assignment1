package com.finzly.looping.dowhileloop;
//14) Write a Program To print count of even No 1 to 25 no.

public class Prog14 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		do {
			if (i % 2 == 0) {
				count++;
			}
			i++;
		} while (i <= 25);
		System.out.println("count of even num 1 to 25 is " + count);
	}
}
