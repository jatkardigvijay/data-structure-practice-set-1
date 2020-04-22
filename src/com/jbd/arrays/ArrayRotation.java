package com.jbd.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}

	public void leftRotate(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateByOne(arr, n);
		}
	}

	public void leftRotateByOne(int[] arr, int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
