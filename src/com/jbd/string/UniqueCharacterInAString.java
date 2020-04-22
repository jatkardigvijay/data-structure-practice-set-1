package com.jbd.string;

import java.util.Scanner;

public class UniqueCharacterInAString {

	public static void main(String[] args) {

		String str1;
		int i, j = 0, count = 0;
		System.out.println("Enter a string : ");
		Scanner input = new Scanner(System.in);
		str1 = input.next();
		input.close();
	//	char[] ch = str1.toCharArray();
		for (i = 0; i < str1.length(); i++) {
			count = 0;
			for (j = 0; j < str1.length(); j++) {
				if (str1.charAt(i) == str1.charAt(j)) {
					count++;
				}
			}

			if (count <= 1) {
				System.out.println("The unique character is " + str1.charAt(i));
				break;
			} else {
				System.out.println("No unique character present");
			}
		}

	}
}
