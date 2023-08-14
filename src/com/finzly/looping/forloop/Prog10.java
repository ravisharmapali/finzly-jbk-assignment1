package com.finzly.looping.forloop;
//10) Write a Program To print even and odd No

public class Prog10 {
	public static void main(String[] args) {
		
		for(int i=50;i<=100;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
			}else {
				System.out.println("Odd "+i);
			}
		}
	}
}
