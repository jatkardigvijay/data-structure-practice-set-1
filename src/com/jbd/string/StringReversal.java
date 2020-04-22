package com.jbd.string;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		String str1, reverse = "";
		System.out.println("Enter a string that you want to reverse : ");
		Scanner input = new Scanner(System.in);
		str1 = input.nextLine();
		input.close();
		char[] ch = str1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		System.out.println(reverse);
	}
}
