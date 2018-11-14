/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.solutions;

import com.senthil.projects.algorithms.commons.Utils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

public class BinarySearchTest {

    Logger logger = Utils.getLogger(this);

    @Test
    public void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = new int[]{1, 5, 7, 11, 99, 103};
        binarySearch.input = input;
        int numToFInd = 99;
        logger.info("Position of " + numToFInd + " is " + binarySearch.find(numToFInd, 0, input.length-1));
    }
}
