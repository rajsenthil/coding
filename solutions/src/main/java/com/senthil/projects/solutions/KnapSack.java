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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * knapsack (w) = target(w) => w;
 * knapsack(w) < target => knapsack(w+1) = target(w+1) where target(w+1) = targer(w) - w
 * knapsack(w) > target => knapsack(w+!) = target(w)
 *
 */
public class KnapSack {

    Logger logger = LoggerFactory.getLogger(KnapSack.class.getName());

    Stack<Integer> stack = new Stack<>();
    public int[] input;
    boolean completed = false;

    public void knapSack(int startPos, int target) {

        if (startPos >= input.length) return;
        if (completed) return;


        for (int i = startPos; i < input.length; i++) {
            //This is a break for the recursive call
            if (completed) return;
            int val = input[i];
            if (val == target) {
                logger.info("Target {} is matched with {} position", target, startPos);
                stack.push(val);
                completed = true;
                break;
            } else if (val < target) {
                logger.info("Target is {},  {} is small ", target, val);
                stack.push(val);
                knapSack(startPos+1, target-val); //Recursive call
            } else {
                logger.info("Target is {},  {} is big ", target, val);
            }
        }

        //Only if not completed pop the item, Otherwise it is good.
        if (!stack.empty() && !completed) logger.info("Removed the val {} from the stack", stack.pop());
    }

    public Stack getItems() {
        return stack;
    }
}
