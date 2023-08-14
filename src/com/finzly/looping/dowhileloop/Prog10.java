package com.finzly.looping.dowhileloop;
//10) Write a Program To print even and odd No

public class Prog10 {
	public static void main(String[] args) {
		int i = 50;
		do {
			if (i % 2 == 0) {
				System.out.println("Even " + i);
			} else {
				System.out.println("Odd " + i);
			}
			i++;
		} while (i <= 100);
	}
}
