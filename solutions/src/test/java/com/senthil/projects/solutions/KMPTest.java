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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import java.util.Arrays;

public class KMPTest {

    Logger logger = Utils.getLogger(this);

    @Test
    public void testKMPPrefixSuffixMatch(){
        String pattern = "abcdabca";
        int[] expected = {0,0,0,0,1,2,3,1};

        int[] actual = KMP.constructLongestPrefixSuffixMatch(pattern);

        logger.info("Input pattern: {} and the pattern match: {}", pattern, Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testKMPPrefixSuffixMatch2(){
        String pattern = "aabaabaaa";
        int[] expected = {0,1,0,1,2,3,4,5,2};

        int[] actual = KMP.constructLongestPrefixSuffixMatch(pattern);

        logger.info("Input pattern: {} and the pattern match: {}", pattern, Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testKMPPrefixSuffixMatch3(){
        String pattern = "abcdeftyabcd764abcdef";
        int[] expected = {0,0,0,0,0,0,0,0,1,2,3,4,0,0,0,1,2,3,4,5,6};

        int[] actual = KMP.constructLongestPrefixSuffixMatch(pattern);

        logger.info("Input pattern: {} and the pattern match: {}", pattern, Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringContains() {
        String string = "abcd1234abcdef789abcdefg";
        String pattern = "abcdefg";

        logger.info("Does string '{}' contains pattern '{}'? {}", string, pattern, KMP.contains(string, pattern));
    }

    @Test
    public void testStringContains2() {
        String string = "abcd1234abcdef789abcdefg";
        String pattern = "abcdefg";

        logger.info("Position of string '{}' in '{}'? {}", pattern, string, KMP.positionOf(string, pattern));
    }
}
