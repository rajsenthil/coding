package com.senthil.projects.dyn_pgm;

public class TestListNode {
	public void testArraToList(){
		int[] input = new int[] { 4, 3, 2, 1};
		ListNode app = new ListNode();
		ListNode result = app.arrayToList(input);
		while (result != null) {
			System.out.println("Result val: " + result.val);
			result = result.next;
		}
	}		
}
