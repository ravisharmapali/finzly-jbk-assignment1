package com.finzly.looping.forloop;
//5) Write a Program To print sum of 1 to 50 Odd nos.

public class Prog5 {
	public static void main(String[] args) {
		int sum = 0,c=0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
//				sum+=i;
				sum = sum + i;// sum
				c = c + 1;// count
			}
		}
		System.out.println("Sum of 1 to 50 odd nos " + sum);
		System.out.println("Sum of 1 to 50 odd nos " + c);
	}
}
