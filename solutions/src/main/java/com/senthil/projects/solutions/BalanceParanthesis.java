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

import com.senthil.projects.datastructures.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalanceParanthesis {

// Balance Parenthesis: - Given an input string with alphabets and parenthesis, return the final output string such that every opening parenthesis has corresponding closing parenthesis and every closing parenthesis has corresponding opening parenthesis

//Input: - '(ab)c)d' => '(ab)cd'

// Input: '(a(b(c(d)e)f)g' => (a(b(cd)e)f)g

//Examples: 'a(b(c(d)))e)f) => a(b(c(d)))ef

    // 'a)(b'
    // start from left and traverse to right
    // do until first opening paranthesis is met and ignore any close parathesis till then.
    //

    public String balanceParanthesis(String input) {
        int len = input.length(); //7
        char open = '(';
        char close = ')';
        Stack<Character> stack = new Stack<>();

        int currPos = 0;
        List<Character> chars = new ArrayList();

        char c = input.charAt(currPos);
        while (c != open) {
            if (c != close) chars.add(input.charAt(currPos));
            c = input.charAt(++currPos);
        }

        for(int i = currPos; i < input.length(); i++) {
            c = input.charAt(i);
            if (c == open) {
                stack.push(c);
                chars.add(c);
            } else if (c == close && !stack.empty()) {
                stack.pop();
                chars.add(c);
            } else if (c == close && stack.empty()) {

            } else {
                chars.add(c);
            }
        }

        currPos = chars.size()-1;
        while (!stack.empty()) {
            if (chars.get(currPos) == open) {
                chars.remove(currPos);
                stack.pop();
            }
        }

        return Arrays.toString(chars.toArray());
    }

}
