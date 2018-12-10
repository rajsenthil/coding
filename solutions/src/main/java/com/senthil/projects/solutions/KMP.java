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

import java.util.HashMap;
import java.util.Map;

public class KMP {
    private static int position;

    public static boolean contains(String string, String pattern) {
        int[] prefixSuffix = constructLongestPrefixSuffixMatch(string);

        int j = 0;
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == pattern.charAt(j)) {
                j++;
                if (j == pattern.length()) {
                    position = i - pattern.length();
                    return true;
                }
            } else {
                j = prefixSuffix[j-1 < 0 ? 0 : j -1];
            }
        }
        return false;
    }

    public static int positionOf(String string, String pattern) {
        if (!contains(string, pattern)) return -1;
        return position;
    }

    static int[] constructLongestPrefixSuffixMatch(String pattern) {
        Map<String, Integer> map = new HashMap();
        int length = pattern.length();
        int[] prefixSuffix =  new int[length];
        int j = 0;
        int i = 1;
        while(i < length) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                prefixSuffix[i] = j+1;
                i++;
                j++;
            } else {
                i++;
                j = prefixSuffix[j-1 < 0 ? 0 : j-1];
            }
        }

        while (j > 0) {
            if (pattern.charAt(i - 1) == pattern.charAt(j)) {
                prefixSuffix[i - 1] = j + 1;
                break;
            } else {
                j = prefixSuffix[j - 1 < 0 ? 0 : j - 1];
            }
        }
        return prefixSuffix;
    }
}
