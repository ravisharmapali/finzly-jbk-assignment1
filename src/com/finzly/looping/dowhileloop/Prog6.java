package com.finzly.looping.dowhileloop;
//6) Write a Program To print sum of 1 to 50 EVEN nos.

public class Prog6 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}while(i<=50);
		System.out.println("Sum of 1 to 50 even "+sum);
	}
}
