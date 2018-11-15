/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.algorithms;

import com.senthil.projects.algorithms.commons.Utils;
import org.slf4j.Logger;

/**
 * Partition is base used in Quick sort and other algorithms.
 */
public class Partition {

    Logger logger = Utils.getLogger(this);

    int[] input;
    int partValue;

    //Use two pointers,  'i' starting left traversing right and 'j' starting from right traversing left
    public void partition() {
        int i = 0;
        int j = input.length-1;

        while (i < j) {
            if (input[i] >= partValue){
                logger.info("Left input value: {} is greater than the part value {} and swapping with right {}", input[i], partValue, input[j]);
                swap(i,j);
                j--;
            } else if (input[j] < partValue) {
                logger.info("Right input value: {} is less than the part value {} and swapping with left {}", input[i], partValue, input[j]);
                swap(i,j);
                i++;

            } else {
                i++;
                j--;
            }
        }

        logger.info("parting index is {} ", i);
    }

    public void swap(int from, int to) {
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;

    }

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    public void setPartValue(int partValue) {
        this.partValue = partValue;
    }
}
