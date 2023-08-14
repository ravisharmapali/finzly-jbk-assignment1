package com.finzly.looping.forloop;
//9) Write a Program To print sum of odd and even no.

public class Prog9 {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 50; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("Sum of 50 to 100 even num "+sumEven);
		System.out.println("Sum of 50 to 100 odd num "+sumOdd);
	}
}
