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

import com.senthil.projects.datastructures.Stack;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class KnapSackTest {

    Logger logger = LoggerFactory.getLogger(KnapSackTest.class.getName());

    @Test
    public void testKnapSack() {
        int[] items = {11, 8, 7, 6, 5};
        int target =20;
        logger.info("Items : " + Arrays.toString(items) + " and target :" + target);
        long t0 = System.currentTimeMillis();
        KnapSack knapSack = new KnapSack();
        knapSack.input = items;
        knapSack.knapSack(0, target);
        Stack<Integer> stack =knapSack.getItems();
        logger.info("Result: ");
        while (!stack.empty()) logger.info(stack.pop().toString());
        long t1 = System.currentTimeMillis();
        logger.info("Total time taken(in secs): " + (t1-t0)/1000.00);
    }

}
