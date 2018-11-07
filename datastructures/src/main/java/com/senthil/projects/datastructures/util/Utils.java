package com.senthil.projects.datastructures.util;

import com.senthil.projects.datastructures.LinkedListNode;

public class Utils {

    public static void printLinkedList(LinkedListNode head){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        LinkedListNode current = head;
        while (current != null) {
            System.out.printf("%s => ",current.getData());
            current = current.next;
        }
        System.out.printf(" null.\n");
    }
}
