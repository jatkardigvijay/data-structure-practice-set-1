package com.jbd.linkedlist;

public class ReverseLinkedList {

	static Node head;

	static class Node {

		Node next;
		int data;

		public Node(int d) {
			data = d;
			next = null;
		}

	}

	Node reverseNode(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.head = new Node(85);
		rll.head.next = new Node(15);
		rll.head.next.next = new Node(4);
		rll.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		rll.printList(head);
		head = rll.reverseNode(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		rll.printList(head);
	}
}
