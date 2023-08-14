package com.finzly.looping.forloop;
//6) Write a Program To print sum of 1 to 50 EVEN nos.

public class Prog6 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of 1 to 50 even num "+sum);
	}
}
