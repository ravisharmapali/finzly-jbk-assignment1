package com.finzly.task;

// prog to check if a word is having all the vowels or not
public class AllVowelsDemo {
	public static void main(String[] args) {

		String st = "miscellaneous";
		char c[] = { 'a', 'e', 'i', 'o', 'u' };
		st = st.toLowerCase();
		int count = 0;
		for (int i = 0; i < c.length ; i++) {
			for (int j = 0; j < st.length() ; j++) {
				if (c[i] == st.charAt(j)) {
					count++;
					break;
				}

			}
		}
		if(count == 5) {
			System.out.println("Word contains all vowels");
		}else {
			System.out.println("Doesn't contains all vowels");
		}
		System.out.println(count);
		
		//

	}
}