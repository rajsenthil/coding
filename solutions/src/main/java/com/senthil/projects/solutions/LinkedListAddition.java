package com.senthil.projects.solutions;

public class LinkedListAddition {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();

        ListNode root = l3;
        int result = 0;
        int carry = 0;

        while (l1 != null || l2 != null) {
            result = l1.val + l2.val + carry;
            int rem = 0;
            if (result >= 10) {
                carry = result / 10;
                rem = result % 10;
            } else {
                carry = 0;
                rem = result;
            }
            l3.val = rem;
            ListNode next = new ListNode();
            l3.next = next;
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {val = 0;}
    ListNode(int x) {val = x;}
}