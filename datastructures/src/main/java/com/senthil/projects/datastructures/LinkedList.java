/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.datastructures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class LinkedList<T> {
    private static Logger logger = LoggerFactory.getLogger(LinkedList.class.getName());
    LinkedListNode<T> head;
    int size = 0; // Just for inspecting...

    public LinkedList<T> addNode(T data){
        LinkedListNode<T> node = new LinkedListNode(data);
        size++;
        if (head == null) {
            head = node;
            return this;
        }
        LinkedListNode current = head;
        LinkedListNode prev = null;
        while(current != null) {
            prev = current;
            current = current.next;
        }
        prev.next = node;
        return this;
    }

    public void delNode(T data){
        if (head.data == data) {
            head = head.next;
            return;
        }

        LinkedListNode current = head.next;
        LinkedListNode prev = head;

        while(current != null) {
            if (current.data == data) {
                prev.next = current.next;
                size--;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public void delDuplicates(){
        if (head == null) return;
        LinkedListNode<T> current = head.next;
        LinkedListNode prev = head;
        Set<T> set = new HashSet<>();
        set.add(head.data);
        while (current != null){
            if (set.contains(current.data)) {
//                System.out.println("Duplicates found: " + current.data);
                logger.info("Duplicates found: " + current.data);
                prev.next = current.next;
                current = current.next;
                size--;
            } else {
                set.add(current.data);
                prev = current;
                current = current.next;
            }
        }
    }
}
