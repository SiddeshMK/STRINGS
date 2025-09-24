package org;

//public class SUMOFDIGITS {
	import java.util.Scanner;

public class SumOfDigitsInString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();
	        
	        int sum = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            // Check if the character is a digit
	            if (Character.isDigit(ch)) {
	                // Convert char digit to int and add to sum
	                sum += ch - '0';
	            }
	        }
	        
	        System.out.println("Sum of digits in the string: " + sum);
	    }
	}



