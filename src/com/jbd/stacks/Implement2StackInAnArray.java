package com.jbd.stacks;

public class Implement2StackInAnArray {

	int top1, top2;
	int size;
	int arr[];

	public Implement2StackInAnArray(int n) {
		size = n;
		arr = new int[n];
		top1 = -1;
		top2 = size;

	}

	void push1(int x) {

		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack is Overflowing");
			System.exit(1);
		}
	}

	void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack is Overflowing");
			System.exit(1);
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);

		}
		return 0;
	}

	public static void main(String[] args) {

		Implement2StackInAnArray im = new Implement2StackInAnArray(5);
		im.push1(45);
		im.push1(48);
		im.push2(35);
		im.push2(36);

		System.out.println("Popped item from stack 1 is : " + im.pop1());

		im.push2(38);

		System.out.println("Popped item from stack 2 is : " + im.pop2());
	}
}
