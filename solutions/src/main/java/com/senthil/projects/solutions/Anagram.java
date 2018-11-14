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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy.
 * The original word or phrase is known as the subject of the anagram.
 *
 * The recursive is best suited for this puzzle to solve efficiently.
 * Take the scenario with string ABC and the sequence it follows are
 *   * ABC
 *   * ACB (Rotated between BC)
 *   * BAC (Rotated between ACB as both B and C are done)
 *   * BCA (Rotated between AC)
 *   * CAB (Roated between BAC as both A and C are done)
 *   * CBA (Rotated between AB)
 *   * No more rotation left and DONE
 *
 * So here the it calls recursively with varying starting character as anagram(ABC) => A to call anagram(BC) => AB to call anagram(C) since no more left,
 * here the output is printed (as here or can be stored for processing).
 *
 * anagram("ABC") => A with anagram("BC") = > A with B with anagram("C")
 *
 *
 */
public class Anagram {

    private Logger logger = Utils.getLogger(this);

    char[] input;
    int size;

    static int printCount = 0;

    public void setInput(char[] input) {
        this.input = new char[input.length+1]; // given length + 1 to accommodate the input the '\0' as prefix.
        this.input[0] = '\0';
        for (int i = 0; i < input.length; i++) this.input[i+1] = input[i];
        size = input.length+1;
    }

    public void anagram(int newSize) {
        if (newSize == 1) {
            print(input);
            return;
        }
        for ( int i = 0; i < newSize; i++) {
            anagram(newSize - 1);
            rotate(newSize);
        }
    }

    private void rotate(int newSize) {
        int pos = size - newSize;
        char c = input[pos];
        for (int i = pos; i < size-1; i++) input[i] = input[i+1];
        input[size-1] = c;
    }

    private void print(char[] input) {
        logger.info(new String(Arrays.copyOfRange(input, 1, input.length)));
        printCount++;
    }

    public int getPrintCount(){
        return printCount;
    }
}
