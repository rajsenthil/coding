/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.datastructures.util;

import com.senthil.projects.datastructures.LinkedListNode;
import com.senthil.projects.datastructures.Stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

    private static Logger logger = LoggerFactory.getLogger(Utils.class.getName());

    public static void printLinkedList(LinkedListNode head){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        LinkedListNode current = head;
        while (current != null) {
            logger.info("%s => ",current.getData());
            current = current.next;
        }
        logger.info(" null.\n");
    }

    public static void printStack(Stack stack){
        Stack.StackNode node = stack.peek();
        while (node != null) {
            logger.info(node.getData().toString());
            logger.info("=====next=====");
            node = node.getNext();
        }
    }

    public static Logger getLogger(Object obj){
        return LoggerFactory.getLogger(obj.getClass().getName());
    }
}
