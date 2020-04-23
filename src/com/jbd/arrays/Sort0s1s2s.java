package com.jbd.arrays;

public class Sort0s1s2s {

	// method for sorting
	static void sort0s1s2s(int a[], int arr_size) {
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}

	// method to print array
	static void printArray(int arr[], int arr_size) {
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 1, 0, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort0s1s2s(arr, arr_size);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}
}
