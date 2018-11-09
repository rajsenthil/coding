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

public class BinarySearch {
    public int[] input;

    public int find(int num, int start, int end){
        if (start >= end) return -1;
        int mid = (start + end) / 2;
        if (num == input[mid]) return mid;
        if (num < input[mid]) return find(num, start, mid);
        else return find(num, mid+1, end);
    }

}
