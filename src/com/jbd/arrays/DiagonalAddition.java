package com.jbd.arrays;

public class DiagonalAddition {

	public static void main(String[] args) {

		int[][]matrix = {
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7}
		};
		printAdditionOfDiagonals(matrix, 4);
	}

	public static void printAdditionOfDiagonals(int[][] mat, int n) {

		int leftTop2BtmRight = 0, rightTop2BtmLeft = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == j) {
					leftTop2BtmRight = leftTop2BtmRight + mat[i][j];
				}
				if ((i + j) == (n - 1)) {
					rightTop2BtmLeft = rightTop2BtmLeft + mat[i][j];
				}
			}
		}
		System.out.println("Left diagonal addition is : " + leftTop2BtmRight);

		System.out.println("Right diagonal addition is : " + rightTop2BtmLeft);
	}
}
