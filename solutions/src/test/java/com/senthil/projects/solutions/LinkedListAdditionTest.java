package com.senthil.projects.solutions;

import org.junit.jupiter.api.Test;

public class LinkedListAdditionTest {

    @Test
    public void addTwoNumnbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        LinkedListAddition linkedListAddition = new LinkedListAddition();
        ListNode result = linkedListAddition.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void addTwoNumnbersV2() {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        LinkedListAddition linkedListAddition = new LinkedListAddition();
        ListNode result = linkedListAddition.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
