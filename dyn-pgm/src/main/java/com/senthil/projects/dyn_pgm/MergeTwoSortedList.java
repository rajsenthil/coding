package com.senthil.projects.dyn_pgm;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = null;
		ListNode cl1 = list1;
		ListNode cl2 = list2;
		ListNode head = null;

		ListNode node = new ListNode();
		while (cl1 != null && cl2 != null) {
			System.out.println("Loop continuing...");
			if (cl1.val <= cl2.val) {
				System.out.println("cl1.val <= cl2.val::: " + cl1.val + " <= " + cl2.val);
				node.val = cl1.val;
				cl1 = cl1.next;
				if (cl1 == null)
					break;
			} else {
				System.out.println("cl1.val > cl2.val::: " + cl1.val + " > " + cl2.val);
				node.val = cl2.val;
				cl2 = cl2.next;
				if (cl2 == null)
					break;
			}

			if (result == null) {
				System.out.println("result is null and assigning to head: " + node.val);
				result = node;
				head = node;
			} else {
				System.out.println("Assinging next element::: " + node.val);
				result.next = node;
				result = result.next;				
			}
			node = new ListNode();
		}
		System.out.println("Outside the main loop");
		while (cl1 != null) {
				node = new ListNode();
			node.val = cl1.val;
			System.out.println("Handling the remaining cl1 list:::" + cl1.val);
			if (result == null) {
				System.out.println("Rest of cl1 lists, assinging to result and head::: " + node.val);
				result = node;
				head = node;
			} else {
				System.out.println("Rest of cl1 lists::: " + node.val);
				result.next = node;
				result = result.next;
			}
			cl1 = cl1.next;
		}

		while (cl2 != null) {
			node = new ListNode();
			node.val = cl2.val;
			System.out.println("Handling the rest of cl2::: " + node.val);
			if (result == null) {
				System.out.println("Assigning to result and head::: " + node.val);
				result = node;
				head = node;
			} else {
				System.out.println("assigining to result for cl2 lists::: " + node.val);
				result.next = node;
				result = result.next;
			}
			cl2 = cl2.next;
		}
		return head;
	}
}
