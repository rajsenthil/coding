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

import com.senthil.projects.datastructures.util.Utils;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAddNode(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Utils.printLinkedList(linkedList.head);
    }

    @Test
    public void testWithHead(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addNode(1);
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 1);
    }

    @Test
    public void testWith5Nodes(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addNode(1).addNode(2).addNode(3).addNode(4).addNode(5);
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 5);
    }

    @Test
    public void testDelNode3(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addNode(1).addNode(2).addNode(3).addNode(4).addNode(5);
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 5);

        //deleting the node with value 3
        linkedList.delNode(3);
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 4);
    }

    @Test
    public void testDelDuplicates(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addNode(1).addNode(2).addNode(3).addNode(2).addNode(2).addNode(4).addNode(5).addNode(4);
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 8);
        linkedList.delDuplicates();
        Utils.printLinkedList(linkedList.head);
        assert (linkedList.size == 5);
    }
}
