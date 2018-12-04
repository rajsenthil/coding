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

public class SegmentTree {

    private int[] input;
    private int[] segments;

    public SegmentTree(int[] input) {
        this.input = input;

        segments = new int[twoPowers(input.length)*2-1];
        constructMinSegmentTree(input, segments, 0, input.length-1, 0);
    }

    private int twoPowers(int size) {
        int twoPowers = 1;
        while(size > 0) {
            twoPowers *= 2;
            size /= 2;
        }
        return twoPowers;
    }

    // The construction is to find the minimum range.
    private void constructMinSegmentTree(int[] input, int[] segment, int lo, int hi, int pos) {
        if (lo == hi) { // if leaf node?
            segments[pos] = input[lo];
        } else {
            int mid = lo + (hi-lo)/2;
            constructMinSegmentTree(input, segment, lo, mid, 2*pos+1);
            constructMinSegmentTree(input, segment, mid+1, hi, 2*pos+2);
            segments[pos] = min(segments[2*pos+1], segments[2*pos+2]);
        }
    }

    private int min(int left, int right) {
        return left < right ? left : right;
    }

    public int[] getSegments() { return segments; }

    //Total overlap, then return the value in the segment position
    //No overlap, return the MAX value
    //If partial overlap, check the children(both left and right).
    public int minQuery(int[] segment, int from, int to, int lo, int hi, int pos) {
        if (from <= lo && to >= hi) return segment[pos];            // total overlap
        else if (from > hi || to < lo) return Integer.MAX_VALUE;    // no overlap

        int mid = lo + (hi-lo)/2;
        return min(minQuery(segment, from, to, lo, mid, 2*pos+1),
                minQuery(segment, from, to, mid+1, hi, 2*pos+2));
    }
}
