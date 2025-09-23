package org;

import java.util.Scanner;

public class VowelsUpperCaseConsantsLower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str = s.nextLine();

        String st = tovowels(str);
        System.out.println("Modified string: " + st);
    }

    private static String tovowels(String str) {
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
        	
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {

                if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' ||
                    ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    
                    if (ch[i] >= 'a' && ch[i] <= 'z') {
                        ch[i] = (char)(ch[i] - 32);
                    }

                } else {

                    if (ch[i] >= 'A' && ch[i] <= 'Z') {
                        ch[i] = (char)(ch[i] + 32);
                    }
                }
            }
        }

        return new String(ch);
    }
}
