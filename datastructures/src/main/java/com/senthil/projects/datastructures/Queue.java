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

import java.util.NoSuchElementException;

public class Queue<T> {

    private QueueNode<T> first;
    private QueueNode<T> last;

    public class QueueNode<T> {
        T data;
        QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    public Queue<T> add(T data){
        QueueNode<T> node = new QueueNode<>(data);
        if (last == null) {
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        if (first == null) first = last;
        return this;
    }

    public T peek() {
        if (first == null) return null;
        return first.data;
    }

    public QueueNode element(){
        if (first == null) throw new NoSuchElementException();
        return first;
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        QueueNode<T> node = first;
        if (first.next == null) {
            first = null;
            last = null;
        } else {
            first = first.next;
        }
        return node.data;
    }

    public T poll() {
        if (first == null) return null;
        QueueNode<T> node = first;
        first = first.next;
        return node.data;
    }
}
