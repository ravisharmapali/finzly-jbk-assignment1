package com.finzly.task;

public class AllVowelsTest {
	public static void main(String[] args) {

		String st = "miscellaneous";

		if (checkStringForAllVowels(st)) {
			System.out.println("contains all vowels");
		} else {
			System.out.println("Doesn't contains all vowels");
		}

	}

	public static boolean checkStringForAllVowels(String s) {

		//  array of size 5
		int[] arr = new int[5];
		// to mark the vowels
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a')
				arr[0] = 1;
			else if (s.charAt(i) == 'E' || s.charAt(i) == 'e')
				arr[1] = 1;
			else if (s.charAt(i) == 'I' || s.charAt(i) == 'i')
				arr[2] = 1;
			else if (s.charAt(i) == 'O' || s.charAt(i) == 'o')
				arr[3] = 1;
			else if (s.charAt(i) == 'U' || s.charAt(i) == 'u')
				arr[4] = 1;

		}

		// check
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				return false;

		}
		return true;
	}

		
}
