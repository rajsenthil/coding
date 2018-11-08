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

import com.senthil.projects.datastructures.util.Utils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackTest {

    private Logger logger = LoggerFactory.getLogger(StackTest.class.getName());
    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1).push(2).push(3);
        Utils.printStack(stack);
        assert stack.size() == 3;
    }

    @Test
    public void testStackPushAndPop(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1).push(2).push(3).push(4);
        Utils.printStack(stack);
        logger.info(stack.pop().toString());
        logger.info(stack.pop().toString());
        assert stack.size() == 2;
    }
}
