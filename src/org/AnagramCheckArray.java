package org;

import java.util.Scanner;

public class AnagramCheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST STRING:");
        String s1 = sc.nextLine();

        System.out.println("ENTER SECOND STRING:");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        // Step 1: If lengths differ → not an anagram
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Frequency array for 26 alphabets
        int[] freq = new int[26];

        // Step 3: Count characters in first string
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch - 'a']++;
        }

        // Step 4: Subtract counts using second string
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq[ch - 'a']--;
        }

        // Step 5: Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
