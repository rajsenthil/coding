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

import java.util.HashMap;
import java.util.Map;

/**
 * Busiest Time in The Mall
 * The Westfield Mall management is trying to figure out what the busiest moment at the
 * mall was last year. You’re given data extracted from the mall’s door detectors.
 * Each data point is represented as an integer array whose size is 3.
 * The values at indices 0, 1 and 2 are the timestamp, the count of visitors,
 * and whether the visitors entered or exited the mall (0 for exit and 1 for entrance),
 * respectively. Here’s an example of a data point: [ 1440084737, 4, 0 ].
 *
 * Note that time is given in a Unix format called Epoch, which is a nonnegative
 * integer holding the number of seconds that have elapsed
 * since 00:00:00 UTC, Thursday, 1 January 1970.
 *
 * Given an array, data, of data points, write a function findBusiestPeriod that returns
 * the time at which the mall reached its busiest moment last year.
 * The return value is the timestamp, e.g. 1480640292. Note that if there is more than
 * one period with the same visitor peak, return the earliest one.
 *
 * Assume that the array data is sorted in an ascending order by the timestamp.
 * Explain your solution and analyze its time and space complexities.
 *
 */
class BusiestTimeInMall {

    public static int findBusiestPeriod(int[][] data) {
        // your code goes here
        Map<Integer,Integer> tsMap = new HashMap();
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxTs = 0;
        int currentTs = data[0][0];
        int prevTs = data[0][0];
        for(int i = 0; i < data.length; i++){
            currentTs = data[i][0];
            int val = (data[i][2] == 0 ? -1 * data[i][1] : data[i][1]);
            if (currentTs == prevTs) {
                sum+= val;
            } else if (maxSum < sum) {
                maxSum = sum;
                maxTs = prevTs;
                prevTs = currentTs;
                sum = val;
            }
        }
        return maxTs;
    }

}