package com.finzly.looping.whileloop;
//15) Write a Program To print count of odd No 1 to 25 no.			

public class Prog15 {
	public static void main(String[] args) {

		int count = 0;
		int i = 1;
		while (i <= 25) {
			if (i % 2 == 1) {
				count++;
			}
			i++;
		}
		System.out.println("count of odd num 1 to 25 is " + count);

	}
}
