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

public class LongestCommonSubsequence {

    private char[] input1;
    private char[] input2;

    private int[][] memoization;

    public void setInputs(String input1, String input2 ) {
        this.input1 = input1.toCharArray();
        this.input2 = input2.toCharArray();
        memoization = new int[input1.length()][input2.length()];
        initialize();
    }

    public void initialize() {
        for(int i = 0; i < memoization.length; i++) {
            for (int j = 0; j < memoization[0].length; j++) {
                memoization[i][j] = -1;
            }
        }
    }

    public int lcs(int i, int j) {
        if (i > input1.length - 1 || j > input2.length - 1) return 0;

        if (memoization[i][j] != -1) return memoization[i][j];
        if (input1[i] == input2[j]) {
            memoization[i][j] = 1 + lcs(i+1, j+1);
        } else {
            memoization[i][j] = max(lcs(i+1, j), lcs(i, j+1));
        }
        return memoization[i][j];
    }
    
    public int max(int left, int right) {
        return left > right ? left : right;
    }
}
