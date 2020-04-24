package com.jbd.timecomplexity;

import java.util.Scanner;

public class BigOOfN {

	public static void main(String[] args) {

		// O(n) --> means as many inputs or elements, that much time required to iterate
		// or traverse
		System.out.println("Static :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}

		// or dynamic
		System.out.println();
		System.out.println("Dynamic :");
		int elements;
		System.out.print("Enter the number of elements you want to put in an array : ");
		Scanner sc = new Scanner(System.in);
		elements = sc.nextInt();
		int[] num = new int[elements];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("The elements are : ");
		for (int j : num) {
			System.out.print(j + " ");
		}
	}
}
