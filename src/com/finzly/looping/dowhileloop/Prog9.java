package com.finzly.looping.dowhileloop;
//9) Write a Program To print sum of odd and even no.
public class Prog9 {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int i = 50;
		do {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			i++;
		} while (i <= 100);
		System.out.println("Sum of 50 to 100 even " + sumEven);
		System.out.println("Sum of 50 to 100 odd " + sumOdd);

	}
}
