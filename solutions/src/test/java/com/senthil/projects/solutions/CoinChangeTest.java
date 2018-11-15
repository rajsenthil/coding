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

public class CoinChangeTest {

    Logger logger = Utils.getLogger(this);

    @Test
    public void testCoinChange() {
        int[] coins = {2, 5, 6, 7};
//        int total = 17;
        int total = 13;

        logger.info("Coins: {}", Arrays.toString(coins));
        logger.info("Total: {}", total);
        CoinChange coinChange = new CoinChange(coins, total);
        coinChange.makeChange();
        coinChange.coinChange();
        logger.info("Changed coins = {}", coinChange.coinChange().toString() );
    }
}
