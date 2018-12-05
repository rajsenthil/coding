/*
 * Copyright 2018  Senthil Rajendran
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.senthil.projects.solutions.strings;

public class StringReverse {

    public static char[] reverseString(char[] input) {
        int len = input.length;
        int start = 0, end = len-1;
        while (start<end) {
            swap(input, start,end);
            start++;
            end--;
        }

        return input;
    }

    private static void swap(char[] input, int from, int to) {
        char c = input[from];
        input[from] = input[to];
        input[to] = c;
    }
}
