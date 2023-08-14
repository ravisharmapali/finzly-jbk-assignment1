package com.finzly.looping.whileloop;
//10) Write a Program To print even and odd No

public class Prog10 {
	public static void main(String[] args) {
		int i = 50;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println("Even " + i);
			} else {
				System.out.println("Odd " + i);
			}
			i++;
		}
	}
}
