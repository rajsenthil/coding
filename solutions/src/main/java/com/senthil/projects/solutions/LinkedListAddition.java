package com.senthil.projects.solutions;

public class LinkedListAddition {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);

        ListNode root = l3;
        int result = 0;
        int carry = 0;

        while (l1 != null || l2 != null) {
            result += l1 != null ? l1.val : 0;
            result += l2 != null ? l2.val : 0;
            result += carry;
            int rem = 0;
            if (result >= 10) {
                carry = result / 10;
                rem = result % 10;
            } else {
                carry = 0;
                rem = result;
            }
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            l3.val = rem;
            ListNode next = null;
            if (l1 !=null || l2 != null) {
                next = new ListNode(0);
                l3.next = next;
                l3 = l3.next;
            }
            result = 0;
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}