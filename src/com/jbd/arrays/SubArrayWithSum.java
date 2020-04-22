package com.jbd.arrays;

public class SubArrayWithSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Array is : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		arrayDemo(arr, 1, 6);

	}

	public static void arrayDemo(int[] arr, int from, int to) {
		System.out.println();
		System.out.println("Subarray is :");
		for (int i = from; i < to; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}