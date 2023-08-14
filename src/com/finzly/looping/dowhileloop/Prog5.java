package com.finzly.looping.dowhileloop;
//5) Write a Program To print sum of 1 to 50 Odd nos.

public class Prog5 {
	public static void main(String[] args) {
		
		int i=1;
		int sum = 0;
		do {
			if(i%2==1) {
				sum+=i;
			}
			i++;
		}while(i<=50);
		System.out.println("Sum of 1 to 50 odd "+sum);
	}
}
