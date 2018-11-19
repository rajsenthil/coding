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
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * https://en.wikipedia.org/wiki/Knapsack_problem#0/1_knapsack_problem
 * 
 * Assume wights W : w1, w2, w3, ...., wn are the weights given
 * and the selling cost of those weights are
 * costs C: c1, c2, c3, ....., cn respectively.
 * Find the maximum profit P for selling S weights
 */
public class KnapSack_0_1 {

    Logger logger = Utils.getLogger(this);

    /*
    ** Knapsack 0/1 is pick or not to pick as a whole.
    *  As given in the wiki link https://en.wikipedia.org/wiki/Knapsack_problem#0/1_knapsack_problem,
    *  if c[i] is the selling costs of i-th weight w[i], then
    *  maximize the sum of (x[i]*c[i]) subject to, sum of (x[i]*w[i]) <= W, where is the total weight.
    *
    */
    public int knapSack01(int totalWeight, int[] costs, int[] weights) {
        logger.info("Total Weight:{}; Wight Index: {}; weight: {}", totalWeight, Arrays.toString(costs), Arrays.toString(weights));

        if (costs.length != weights.length) {
            logger.info("Please enter the cost for the corresponding weight. The number of costs and weights should match");
            return -1;
        }
        int[][] weightCosts = new int[weights.length][totalWeight+1];
        for(int i = 0; i <= weights.length; i++) weightCosts[0][i] = 0;

        for(int i = 0; i < weights.length; i++) {
            for(int j = 1; j <= totalWeight; j++) {
//                logger.info("                    = {} + ({} > 0 ? {} : 0), ({} >=0 ? {} : 0))", costs[i], c, costs[c], w, weightCosts[w][j]);
                int w = i - 1;
                if (weights[i] <= j) {
                    int c = j - weights[i];
                    logger.info("weightCosts[{}][{}] = Math.max(costs[{}] + ({} > 0 ? costs[{}] : 0), ({} >=0 ? weightCosts[{}][{}] : 0))", i, j, i, c, c, w, w, j);
                    weightCosts[i][j] = Math.max(costs[i] + (c > 0 ? weightCosts[i][c] : 0), (w >= 0 ? weightCosts[w][j] : 0));
                } else {
                    weightCosts[i][j] = w >= 0 ?weightCosts[i-1][j] : 0;
                }
            }
        }

        return weightCosts[weights.length-1][totalWeight];
    }


}
