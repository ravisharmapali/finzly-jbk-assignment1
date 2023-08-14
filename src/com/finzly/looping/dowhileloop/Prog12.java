package com.finzly.looping.dowhileloop;
//12) Write a Program To print 100 to 1 no.

public class Prog12 {
	public static void main(String[] args) {
		int i = 100;
		do {
			System.out.println(i--);
		} while (i >= 1);
	}
}
