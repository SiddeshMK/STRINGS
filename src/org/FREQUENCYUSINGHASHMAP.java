package org;

import java.util.HashMap;
import java.util.Scanner;

public class FREQUENCYUSINGHASHMAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER THE STRING");
        String s1 = s.nextLine();

        // Use Integer as value type
        HashMap<Character, Integer> frq = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // If character exists, increment count
            if (frq.containsKey(ch)) {
                frq.put(ch, frq.get(ch) + 1);
            } else {
                frq.put(ch, 1);
            }
        }

        System.out.println("Character frequencies:");
        for (Character ch : frq.keySet()) {
            System.out.println(ch + ": " + frq.get(ch));
        }
    }
}
