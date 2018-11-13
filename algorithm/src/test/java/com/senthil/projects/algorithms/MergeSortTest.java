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

public class MergeSortTest {
    Logger logger = LoggerFactory.getLogger(MergeSortTest.class.getName());

    @Test
    public void testEmptyInput() {
        int arr[] = {};
        logger.info("Given array" + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        logger.info("After sort " + Arrays.toString(arr));
    }

    @Test
    public void testMergeSort() {
        int arr[] = {12, 11, 13, 5, 6, 7};
        logger.info("Given array" + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        logger.info("After sort " + Arrays.toString(arr));
    }
}
