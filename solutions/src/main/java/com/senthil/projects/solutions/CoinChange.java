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

import java.util.ArrayList;
import java.util.List;

/**
 * From wiki, https://en.wikipedia.org/wiki/Change-making_problem, the optimal solutions for minimum coin change is
 * interpreted to
 * T[i] = min ( T[i], 1 + T [i-C[i]] )
 * where
 *      T[i] is minimum coins for the i-th total
 *      minimum of, if coin is picked (i.e. T [i-C[i]]) and not picked (i.e. T[i] )
 * Note: Total needs to be higher or equal to the coin value to pick.
 */
public class CoinChange {

    Logger logger = Utils.getLogger(this);

    int[] coins; // Coin values
    int[] T;     // Array to track the minimums
    int[] P;     // Array to track the index of picked item
    int total;

    public CoinChange(int[] coins, int total) {
        this.coins = coins;
        this.total = total;
        T = new int[total+1];
        P = new int[total+1];


        for (int i = 0; i < total+1; i++) {
            T[i] = Integer.MAX_VALUE;
            P[i] = -1;
        }
        T[0] = 0;
        P[0] = -1;
    }

    public void makeChange() {
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= total; j++) {
                if (j >= coins[i]) {
                    logger.info("Current total {}", j);
                    //Note: Integer.MAX_VALUE + will overflow. So instead of <code>T[j] > T[j-coins[i]] + 1</code>
                    // the comparison is done against <code>T[j] -1 > T[j-coins[i]]</code>
                    if  (T[j]-1 > (T[j-coins[i]])) {    // if the coin needs to picked?
                        T[j] = T[j-coins[i]]+1;       // pick it
                        P[j] = i;                   // The picked up coin index
                    }                               //else coin is not picked up and keep continuing.
                }
            }
        }
    }

    public List<Integer> coinChange() {
        List<Integer> change = new ArrayList();
        int currentIndex = total;
        while (currentIndex > 0) {
            int coin = coins[P[currentIndex]];
            change.add(coin);
            currentIndex = currentIndex - coin;
        }
        return change;
    }

    public int minCoins() {
        return T[total];
    }
}
