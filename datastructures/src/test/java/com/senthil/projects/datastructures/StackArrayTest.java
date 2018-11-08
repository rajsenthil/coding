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

public class StackArrayTest {
    private Logger logger = LoggerFactory.getLogger(StackArrayTest.class.getName());

    @Test
    public void testStack() {
        StackArray<Integer> stack = new StackArray(10);
        stack.push(1).push(2).push(3);
        stack.display();
        assert stack.size() == 3;
    }

    @Test
    public void testStackPushAndPop(){
        StackArray<Integer> stack = new StackArray(10);
        stack.push(1).push(2).push(3).push(4);
        logger.info(stack.pop().toString());
        logger.info(stack.pop().toString());
        stack.display();
        assert stack.size() == 2;
    }
}
