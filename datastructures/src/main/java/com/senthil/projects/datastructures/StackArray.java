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

import com.senthil.projects.algorithms.commons.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * This stack uses array for storing data
 */
public class StackArray<T> {

    private Logger logger = Utils.getLogger(this);

    Object[] datas;
    private static int size = 0;
    private int nitems;

    public StackArray(int initSize) {
        size = initSize;
        datas = new Object[size];
    }

    public StackArray<T> push(T data) {
        if (nitems == size) increaseArray();
        if (nitems < 0) nitems = 0;
        datas[nitems++] = data;
        return this;
    }

    public T pop() {
        if (nitems < 0 ) throw new EmptyStackException();
        T item = (T)datas[--nitems];
        datas[nitems] = null;
        return item;
    }

    public T peek() {
        if (nitems < 0 ) throw new EmptyStackException();
        return (T)datas[nitems-1];
    }

    public int size() {
        return nitems;
    }

    private void increaseArray() {
        size = size * 2;
        Object[] temp = new Object[size];
        for (int i = 0; i < nitems; i++) temp[i] = datas[i];
        datas = temp;
    }

    public void display() {
        logger.info(Arrays.toString(datas));
    }
}
