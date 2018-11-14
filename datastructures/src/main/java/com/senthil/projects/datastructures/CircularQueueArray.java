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

import java.util.Arrays;

/**
 * A simple circular queue implemented using array with insert and remove only.
 */
public class CircularQueueArray {

    private Logger logger = Utils.getLogger(this);

    int[] datas;
    int rear = 0;
    int maxSize = 0;
    int front = 0;

    public CircularQueueArray(int initSize) {
        datas = new int[initSize];
        maxSize = initSize;
    }

    public CircularQueueArray insert(int data) {
        if (rear == maxSize) rear = 0;
        datas[rear++] = data;
        return this;
    }

    public int remove() {
        if (front+1 == maxSize) front = 0;
        return datas[front++];
    }

    public int[] getDatas() {
        return datas;
    }

    public void display() {
        logger.info(Arrays.toString(datas));
    }
}
