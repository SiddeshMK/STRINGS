package org;

import java.util.Scanner;

public class CapitalConversion {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("ENTER THGE STRING");
		String st = S.next();
		String cs = tocapital(st);
	}

	private static String tocapital(String st) {
		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch [i]<= 'z') {
				ch[i] = (char) (ch[i] - 32);

			}
		}

		return new String(ch);
	}

}
