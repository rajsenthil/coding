/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.algorithms;

/**
 * If the given input data is already partially sorted, insertion sort would be faster.
 * The Worst case scenario is still O(n^2)
 */
public class InsertionSort {
    int[] input;

    public int[] insertionSort(int[] data){
        assert data != null;

        input = data;
        for(int i = 1; i < input.length; i++) {
            int marked = i; // the item marked for insertion
            int temp = input[marked];
            while (marked > 0 && input[marked-1] > temp) {
                input[marked] = input[marked-1];
                --marked;
            }
            //insert the marked item
            input[marked] = temp;
        }
        return input;
    }
}
