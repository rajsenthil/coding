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
 * Selection sort is good to use for is input data relatively small.
 * It reduces the number of swaps to O(n) but comparison is still O(n2)
 */
public class SelectionSort {

    int[] input;

    public int[] selectionSort(int[] data) {
        assert data != null;
        input = data;
        int min = 0;
        for(int i = 0; i < input.length; i++) {
            min = i;
            for(int j = i+1; j < input.length; j++)  if (input[min] > input[j]) min = j; // find the minimum from the rest
            swap(min,i); // and only swap that
        }
        return input;
    }

    private void swap(int from, int to) {
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }


}
