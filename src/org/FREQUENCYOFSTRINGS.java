package org;

import java.util.Scanner;

public class FREQUENCYOFSTRINGS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ENTER THE STRING");
		String s1 = s.nextLine();

		int[] ct = new int[128]; // COUNTING MAXIMUM ASCI STORAGE

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i); // FOR STRING INDEX GETTING
			ct[ch]++; //ct[1]		}
		}

		for (int i = 0; i < ct.length; i++) {
			
			if (ct[i] != 0) {
				System.out.println((char) i + " " + ct[i]);

			}
		}
	}

}
