package com.finzly.looping.dowhileloop;
//7) Write a Program To print -45 to +45 nos.  // negative no and positive no

public class Prog7 {
	public static void main(String[] args) {
		int i=-45;
		do {
			System.out.println(i++);
		}while(i<=45);
	}
}
