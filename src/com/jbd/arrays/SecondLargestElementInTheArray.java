package com.jbd.arrays;

import java.util.Scanner;

public class SecondLargestElementInTheArray {

	public static void main(String[] args) {

		int elements, temp, j, k;
		System.out.print("Enter the number of elements in the array : ");
		Scanner input = new Scanner(System.in);
		elements = input.nextInt();
		int[] n1 = new int[elements];
		System.out.print("Enter the elements : ");
		for (int i = 0; i < n1.length; i++) {
			n1[i] = input.nextInt();
		}
		System.out.print("The elements are : ");
		for (int i : n1) {
			System.out.print(i + " ");
		}
		input.close();
		System.out.println();
		for (j = 0; j < n1.length; j++) {
			for (k = j + 1; k < n1.length; k++) {
				if (n1[j] > n1[k]) {
					temp = n1[j];
					n1[j] = n1[k];
					n1[k] = temp;
				}

			}
			System.out.print(n1[j] + " ");
		}
		System.out.println();
		System.out.print("The 2nd largest element is : " + n1[j - 1]);
	}

}
