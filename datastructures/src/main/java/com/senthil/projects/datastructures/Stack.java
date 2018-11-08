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

import java.util.EmptyStackException;

public class Stack<T> {
    public static class StackNode<T> {
        StackNode next;
        T data;
        public StackNode(T data) {
            this.data = data;
        }

        public StackNode getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    private int itemCount;

    private StackNode<T> last = null;

    public Stack push(T data){
        StackNode<T> node = new StackNode<>(data);
        itemCount++;
        if (last == null) {
            last = node;
            return this;
        }
        node.next = last;
        last = node;
        return this;
    }

    public T pop(){
        if (last == null) throw new EmptyStackException();
        StackNode<T> node = last;
        last = last.next;
        itemCount--;
        return node.data;
    }

    public StackNode<T> peek() {
        if (last == null) throw new EmptyStackException();
        return last;
    }

    public int size() {
        return itemCount;
    }

    public boolean empty(){
        return itemCount < 1;
    }
}
