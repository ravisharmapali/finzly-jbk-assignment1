package com.finzly.looping.forloop;
//15) Write a Program To print count of odd No 1 to 25 no.			

public class Prog15 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("Count of odd num 1 to 25 is " + count);
	}
}
