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
 * Factorial is well suited for recursion
 * where
 *    fact(n) = n*fact(n-1) for n >= 1
 *    fact(0) = 1
 *
 */
public class Factorial {

    private int factorial = 1;

    public int fact(int n) {
        if (n <= 1) return factorial;

        factorial *= n*fact(n-1);
        return factorial;
    }
}
