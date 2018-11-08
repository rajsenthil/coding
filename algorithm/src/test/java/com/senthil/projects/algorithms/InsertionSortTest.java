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

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    Logger logger = LoggerFactory.getLogger(InsertionSortTest.class.getName());

    @Test
    public void testInsertionSort(){
        int[] data = {2, 1, 11, 5, 8, 0, 9};
        logger.info(Arrays.toString(data));
        InsertionSort sort = new InsertionSort();
        int[] result = sort.insertionSort(data);
        logger.info(Arrays.toString(result));
        assertArrayEquals(result, new int[]{0, 1, 2, 5, 8, 9, 11});
    }
}
