package com.finzly.looping.forloop;
//14) Write a Program To print count of even No 1 to 25 no.

public class Prog14 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				count++;
			}

		}
		System.out.println("count of even 1 to 25 is " + count);

		// another way
		count = 0;
		for (int i = 2; i <= 25; i += 2) {
			count++;
		}
		System.out.println(count);

	}
}
