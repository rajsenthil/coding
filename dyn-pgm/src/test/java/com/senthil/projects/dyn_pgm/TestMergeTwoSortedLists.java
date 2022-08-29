package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;

public class TestMergeTwoSortedLists {

	@Test
	public void testMergeTwoLists() {
		ListNode node11 = new ListNode();
		node11.val = 1;
		ListNode node12 = new ListNode();
		node12.val = 2;
		ListNode node13 = new ListNode();
		node13.val = 4;
		node11.next = node12;
		node12.next = node13;
		ListNode list1 = node11;

		ListNode node21 = new ListNode();
		node21.val = 1;
		ListNode node22 = new ListNode();
		node22.val = 3;
		ListNode node23 = new ListNode();
		node23.val = 4;
		node21.next = node22;
		node22.next = node23;
		ListNode list2 = node21;
//
//		ListNode _1 = new ListNode();
//		_1.val = -10;
//		ListNode _2 = new ListNode();
//		_2.val = -6;
//		ListNode _3 = new ListNode();
//		_3.val = -6;
//		ListNode _4 = new ListNode();
//		_4.val = -6;
//		ListNode _5 = new ListNode();
//		_5.val = -3;
//		ListNode _6 = new ListNode();
//		_6.val = 5;
//
//		_1.next = _2;
//		_2.next = _3;
//		_3.next = _4;
//		_4.next = _5;
//		_5.next = _6;
		MergeTwoSortedList app = new MergeTwoSortedList();
		ListNode result = app.mergeTwoLists(list1, list2);
		//ListNode result = app.mergeTwoLists(_1, null);
		while (result != null){
			System.out.println("val: " + result.val);
			result = result.next;
		}
	}
}

/**
 * Merge Two Sorted Lists
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * 
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * 
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 * 
 **/
