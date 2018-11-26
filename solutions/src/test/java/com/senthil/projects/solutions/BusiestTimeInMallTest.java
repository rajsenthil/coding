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

import org.junit.jupiter.api.Test;

public class BusiestTimeInMallTest {

    @Test
    public void test1() {
        int[][] data = {
                {1487799425, 14, 1},
                {1487799425, 4,  0},
                {1487799425, 2,  0},
                {1487800378, 10, 1},
                {1487801478, 18, 0},
                {1487801478, 18, 1},
                {1487901013, 1,  0},
                {1487901211, 7,  1},
                {1487901211, 7,  0}
        };

        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487800378;
    }

    @Test
    public void test2() {
        int[][] data = {
                {1487799425,21,0},
                {1487799427,22,1},
                {1487901318,7,0}
        };

        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487799427;
    }

    @Test
    public void test3() {
        int[][] data = {
                {1487799425,21,1},
                {1487799425,4,0},
                {1487901318,7,0}
        };
        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487799425;
    }

    @Test
    public void test4() {
        int[][] data = {
                {1487799425,14,1},
                {1487799425,4,0},
                {1487799425,2,0},
                {1487800378,10,1},
                {1487801478,18,0},
                {1487801478,18,1},
                {1487901013,1,0},
                {1487901211,7,1},
                {1487901211,7,0}
        };
        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487800378;
    }

    @Test
    public void test5() {
        int[][] data = {
                {1487799425,14,1},
                {1487799425,4,1},
                {1487799425,2,1},
                {1487800378,10,1},
                {1487801478,18,1},
                {1487901013,1,1},
                {1487901211,7,1},
                {1487901211,7,1}
        };
        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487799425;
    }

    @Test
    public void test6() {
        int[][] data = {
                {1487799425, 14, 1},
                {1487799425, 4, 0},
                {1487799425, 2, 0},
                {1487800378, 10, 1},
                {1487801478, 18, 0},
                {1487801478, 19, 1},
                {1487801478, 1, 0},
                {1487801478, 1, 1},
                {1487901013, 1, 0},
                {1487901211, 7, 1},
                {1487901211, 8, 0}
        };
        assert BusiestTimeInMall.findBusiestPeriod(data) == 1487800378;
    }

}
