package com.finzly.looping.whileloop;

public class Prog6 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=50) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("sum of 1 to 50 even "+sum);
	}
}
