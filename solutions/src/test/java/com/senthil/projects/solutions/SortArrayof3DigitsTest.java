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

import java.util.Arrays;

public class SortArrayof3DigitsTest {

    Logger logger = Utils.getLogger(this);

    @Test
    public void testSort() {
        int[] input1 = {0, 1, 2, 0, 1, 2};
        int[] digits = {0, 1, 2};

        logger.info("Given array of integers: {}", Arrays.toString(input1));
        logger.info("Digits: {}", Arrays.toString(digits));

        logger.info("Sorted arrays: {}", Arrays.toString(SortArrayof3Digits.sort(input1, digits)));

        int[] output1 = {0, 0, 1, 1, 2, 2};

        assert Arrays.equals(SortArrayof3Digits.sort(input1, digits), output1);
    }

    @Test
    public void testSort2() {
        int[] input2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] digits = {0, 1, 2};
        logger.info("Given array of integers: {}", Arrays.toString(input2));
        logger.info("Digits: {}", Arrays.toString(digits));

        logger.info("Sorted arrays: {}", Arrays.toString(SortArrayof3Digits.sort(input2, digits)));

        int[] output2 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};

        assert Arrays.equals(SortArrayof3Digits.sort(input2, digits), output2);
    }

    @Test
    public void testSortV2() {
        int[] input1 = {0, 1, 2, 0, 1, 2};
        int[] digits = {0, 1, 2};

        logger.info("Given array of integers: {}", Arrays.toString(input1));
        logger.info("Digits: {}", Arrays.toString(digits));

        logger.info("Sorted arrays: {}", Arrays.toString(SortArrayof3Digits.sortV2(input1, digits)));

        int[] output1 = {0, 0, 1, 1, 2, 2};

        assert Arrays.equals(SortArrayof3Digits.sortV2(input1, digits), output1);
    }

    @Test
    public void testSort2V2() {
        int[] input2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] digits = {0, 1, 2};
        logger.info("Given array of integers: {}", Arrays.toString(input2));
        logger.info("Digits: {}", Arrays.toString(digits));

        logger.info("Sorted arrays: {}", Arrays.toString(SortArrayof3Digits.sortV2(input2, digits)));

        int[] output2 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};

        assert Arrays.equals(SortArrayof3Digits.sortV2(input2, digits), output2);
    }
}
