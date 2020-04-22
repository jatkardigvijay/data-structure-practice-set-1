package com.jbd.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {

		String str1, str2;
		boolean status = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		str1 = input.nextLine();
		System.out.println("Enter string 2 : ");
		str2 = input.nextLine();
		input.close();
		int num1 = str1.length();
		int num2 = str2.length();
		if (num1 != num2) {
			status = false;
			System.out.println("String are not anagrams of each other !");

		} else if (num1 == num2) {

			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
			if (status) {
				System.out.println("Strings : " + str1 + " and " + str2 + " are anagrams of each other !");
			} else {
				System.out.println("Strings : " + str1 + " and " + str2 + " are not anagrams of each other !");
			}
		}
	}
}
