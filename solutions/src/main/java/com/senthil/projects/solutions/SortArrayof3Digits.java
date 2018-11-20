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

/**
 * Sort an array of 0s, 1s and 2s
 */
public class SortArrayof3Digits {

    /**
     * arrayOfIntegers :  {0, 1, 2, 0, 1, 2}
     * digits          :  {0, 1, 2}
     * output          :  {0, 0, 1, 1, 2, 2}
     *
     * arrayOfIntegers :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
     * digits          :  {0, 1, 2}
     * output          :  {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
     *
     * @param arrayOfIntegers
     * @param digits always a 3 items that shows the order in which the digits needs to arranged.
     *               This could also be some colors for solving a DUtch Flag algorithm
     * @return output
     */
    public static int[] sort(int[] arrayOfIntegers, int[] digits) {
        int i = 0;
        int j = arrayOfIntegers.length-1;

        //The first traverse put digits[0] to left and the rest to its right
        while (i < j) {
            if (arrayOfIntegers[i] == digits[1] || arrayOfIntegers[i] == digits[2]) {
                swap(arrayOfIntegers, i, j);
                j--;
            } else if (arrayOfIntegers[j] == digits[0]) {
                swap(arrayOfIntegers, i, j);
                i++;
            } else {
                i++;
                j--;
            }
        }

        // initialize the ith position and make second traverse
//        i++;
        j = arrayOfIntegers.length-1;
        while (i < j) {
            if (arrayOfIntegers[i] == digits[2]) {
                swap(arrayOfIntegers, i, j);
                j--;
            } else if (arrayOfIntegers[j] == digits[1]) {
                swap(arrayOfIntegers, i, j);
                i++;
            } else {
                i++;
                j--;
            }
        }

        return arrayOfIntegers;
    }

    /**
     * The sort method does 2N traversing and below method traverse N times.
     *
     * @param arrayOfIntegers
     * @param digits
     * @return
     */
    public static int[] sortV2(int[] arrayOfIntegers, int[] digits) {
        int i = 0;
        int j = arrayOfIntegers.length-1;
        int k = i;

        while (k <= j) {
            if (arrayOfIntegers[k] == digits[0]) {
                swap(arrayOfIntegers, i, k);
                i++;
                k++;
            } else if (arrayOfIntegers[k] == digits[1]) {
                k++;
            } else if (arrayOfIntegers[k] == digits[2]) {
                swap(arrayOfIntegers, k, j);
                j--;
            }
        }
        return arrayOfIntegers;
    }

    private static void swap(int[] arrayOfIntegers, int i, int j) {
        int temp = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[j];
        arrayOfIntegers[j] = temp;
    }


}
