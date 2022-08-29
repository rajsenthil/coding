package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;

public class TestMergeKSortedLilsts {
	@Test
	public void testMergeKList() {
		int[] array1 = new int[]{1,4,5};
		int[] array2 = new int[]{1,3,4};
		int[] array3 = new int[]{2,6};
		ListNode list1 = new ListNode().arrayToList(array1);
		ListNode list2 = new ListNode().arrayToList(array2);
		ListNode list3 = new ListNode().arrayToList(array3);

		ListNode[] lists = new ListNode[] {list1, list2, list3};
		MergeKSortedLists mergeApp = new MergeKSortedLists();
		ListNode result = mergeApp.mergeKLists(lists);
		System.out.println("Result of meregdlists: " + result);
		while (result != null) {
			System.out.println("result val: " + result.val);
			result = result.next;
		}
	}

	@Test
	public void testMergeKList2() {
		int[] array1 = new int[]{1,4,5};
		int[] array2 = new int[]{1,3,4};
		int[] array3 = new int[]{2,6};
		ListNode list1 = new ListNode().arrayToList(array1);
		ListNode list2 = new ListNode().arrayToList(array2);
		ListNode list3 = new ListNode().arrayToList(array3);

		ListNode[] lists = new ListNode[] {list1, list2, list3};
		MergeKSortedLists mergeApp = new MergeKSortedLists();
		ListNode result = mergeApp.mergeKLists2(lists);
		System.out.println("Result of meregdlists: " + result);
		while (result != null) {
			System.out.println("result2 val: " + result.val);
			result = result.next;
		}
	}
}

/**
 * Merge k Sorted Lists
 *
 * You are given an array of k linked-lists lists, each linked-list is sorted in
 * ascending order.
 * 
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 *
 * Example 2:
 * 
 * Input: lists = []
 * Output: []
 * 
 * Example 3:
 * 
 * Input: lists = [[]]
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 **/
