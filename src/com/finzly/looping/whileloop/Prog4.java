package com.finzly.looping.whileloop;
//4) Write a Program To print 1 to 100 even nos.

public class Prog4 {
	public static void main(String[] args) {
		int i =1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			
		}
	}
}
