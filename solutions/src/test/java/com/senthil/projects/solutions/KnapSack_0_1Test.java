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

public class KnapSack_0_1Test {

    Logger logger = Utils.getLogger(this);

    @Test
    public void testKnapSack_0_1() {
        int[] weights = {2, 3, 4, 5};
        int[] costs = {3, 4, 5, 6};
        logger.info("Given weights: {}", Arrays.toString(weights));
        logger.info("Given costs: {}", Arrays.toString(costs));
        KnapSack_0_1 knapSack01 = new KnapSack_0_1();
        int weight = 9;
        logger.info("Maximum costs for {} is {} ", weight, knapSack01.knapSack01(weight, costs, weights));

    }
}
