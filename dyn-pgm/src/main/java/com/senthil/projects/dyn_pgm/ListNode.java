package com.senthil.projects.dyn_pgm;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode arrayToList(int[] input) {
		if (input == null || input.length == 0)
			return null;		
		ListNode[] nodes = new ListNode[input.length];
		for (int i = 0; i < input.length; i++) {
			ListNode node = new ListNode();
			if (i > 0) {
				nodes[i - 1].next = node;
			}
			node.val = input[i];
			nodes[i] = node;
		}

		return nodes[0];
	}

	public void print(){
		System.out.print("val: " + val+" ==> ");
		ListNode next2 = next;
		while (next2 != null) {
			System.out.print(" val: " + next2.val + " ==> ");
			next2 = next2.next;
		}
		System.out.println("null");
	}
}
