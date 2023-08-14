package com.finzly.looping.dowhileloop;
//15) Write a Program To print count of odd No 1 to 25 no.			

public class Prog15 {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		do {
			if (i % 2 == 1) {
				count++;
			}
			i++;
		} while (i <= 25);
		System.out.println("Count of odd num 1 to 25 is " + count);
	}
}
