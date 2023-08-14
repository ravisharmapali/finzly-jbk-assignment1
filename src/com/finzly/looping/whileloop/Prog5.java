package com.finzly.looping.whileloop;

public class Prog5 {
	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while(i<=50) {
			if(i%2==1) {
				sum+=i;
			}
			i++;
		}
		System.out.println("Sum of odd 1 to 50 is "+sum);
		
	}
}
