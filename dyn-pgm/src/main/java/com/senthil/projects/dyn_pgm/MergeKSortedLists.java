package com.senthil.projects.dyn_pgm;

import java.util.Arrays;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = lists[0];
		for (int i = 1; i < lists.length - 1; i++) {
			result = mergeTwoSortedLists(result, lists[i]);
		}
		result = mergeTwoSortedLists(result, lists[lists.length - 1]);
		return result;
	}

	public ListNode mergeKLists2(ListNode[] lists) {
		ListNode result = lists[0];
		if (lists == null || lists.length == 0) {
			return null;
		} else if (lists.length == 1) {
			result.print();
			return lists[0];
		}
		return mergeKLists2Helper(lists);
	}

	public ListNode mergeKLists2Helper(ListNode[] lists) {
		int len = lists.length;
		System.out.println("Lists length: " + len);
		ListNode mergeResult = null;
		ListNode result = null;
		ListNode leftList = null, rightList = null;
		if (len > 2) {
			// split here
			ListNode[] leftLists = Arrays.copyOfRange(lists, 0, len / 2);
			ListNode[] rightLists = Arrays.copyOfRange(lists, len / 2, len);
			System.out.println("Printing the left lists array");
			for (ListNode node : leftLists) {
				node.print();
			}

			System.out.println("Printing the right lists array");
			for (ListNode node : rightLists) {
				node.print();
			}

			leftList = mergeKLists2Helper(leftLists);
			System.out.println("Left List: ");
			if (leftList != null) {
				leftList.print();
			}
			System.out.println("Right List: ");
			if (rightList != null) {
				rightList.print();
			}
			rightList = mergeKLists2Helper(rightLists);
			if (rightList != null) {
				rightList.print();
			}
		}

		if (len == 1) {
			System.out.println("len = 1 and returning that item");
			lists[0].print();
			return lists[0];
		} else if (len == 0) {
			System.out.print("Lists is empty and returning null");
			return null;
		}
		System.out.println("Merge results:::");
		if (leftList != null) {
			leftList.print();
		}
		if (rightList != null) {
			rightList.print();
		}
		mergeResult = mergeTwoSortedLists(lists[0], lists[1]);
		System.out.print("Printing merge list:");
		if (mergeResult != null)
			mergeResult.print();
		return mergeResult;
	}

	public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
		ListNode result = null;
		ListNode cl1 = list1;
		ListNode cl2 = list2;
		ListNode head = null;

		ListNode node = new ListNode();
		while (cl1 != null && cl2 != null) {
			if (cl1.val <= cl2.val) {
				node.val = cl1.val;
				cl1 = cl1.next;
			} else {
				node.val = cl2.val;
				cl2 = cl2.next;
			}

			if (result == null) {
				result = node;
				head = node;
			} else {
				result.next = node;
				result = result.next;
			}
			node = new ListNode();
		}

		while (cl1 != null) {
			node.val = cl1.val;
			if (result == null) {
				result = node;
				head = node;
			} else {
				result.next = node;
				result = result.next;
			}
			cl1 = cl1.next;
			node = new ListNode();
		}

		while (cl2 != null) {
			node.val = cl2.val;
			if (result == null) {
				result = node;
				head = node;
			} else {
				result.next = node;
				result = result.next;
			}
			cl2 = cl2.next;
			node = new ListNode();
		}
		return head;
	}
}
