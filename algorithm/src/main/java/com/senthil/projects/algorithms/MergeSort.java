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

public class MergeSort {
    public int[] data;

    public void sort(int[] input, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        sort(input, start, mid);
        sort(input, mid + 1, end);
        merge(input, start, end);
    }

    private void merge(int[] input, int start, int end) {

        int mid = (start + end) / 2;

        //Sizes of left and right buffer arrays
        int lsize = mid - start + 1;
        int rsize = end - mid;

        //create and initialize the buffer arrays
        int[] L = new int[lsize];
        int[] R = new int[rsize];

        for (int i = 0; i < lsize; i++) L[i] = input[start + i];

        for (int j = 0; j < rsize; j++) R[j] = input[mid + j + 1];

        //Index of Left and Right arrays
        int l = 0, r = 0;
        int k = start;
        while (l < lsize && r < rsize) {
            if (L[l] <= R[r]) {
                input[k] = L[l];
                l++;
            } else {
                input[k] = R[r];
                r++;
            }
            k++;
        }

        while (l < lsize) {
            input[k] = L[l];
            k++;
            l++;
        }

        while (r < rsize) {
            input[k] = R[r];
            k++;
            r++;
        }

    }
}
