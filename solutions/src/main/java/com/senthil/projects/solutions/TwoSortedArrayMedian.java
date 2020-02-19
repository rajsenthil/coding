package com.senthil.projects.solutions;

import java.util.Arrays;

public class TwoSortedArrayMedian {

    public double findMedianBruteForce(int[] nums1, int[] nums2) {
        int runner1 = 0;
        int runner2 = 0;

        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int totalLength = num1Length + num2Length;
        int[] combined = new int[totalLength];
        int currentRunner = 0;
        int median = 0;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        while (runner1 < num1Length && runner2 < num2Length) {
            if (runner1 < num1Length) {
                num1 = nums1[runner1];
            }

            if (runner2 < num2Length) {
                num2 = nums2[runner2];
            }

            System.out.println("num1:"+num1+"; num2:"+num2);
            if (num1 < num2) {
                combined[currentRunner++] = num1;
                runner1++;
            } else {
                combined[currentRunner++] = num2;
                runner2++;
            }
        }

        if (runner1 < num1Length) {
            for (int i = runner1; i < num1Length; i++) combined[currentRunner++] = nums1[i];
        } else if (runner2 < num2Length) {
            for (int i = runner2; i < num2Length; i++) combined[currentRunner++] = nums2[i];
        }
        System.out.println(Arrays.toString(combined));

        if (totalLength % 2 == 0) {
            return (combined[totalLength /2]+combined[totalLength /2-1])/2.0;
        } else {
            return combined[totalLength /2];
        }
    }
}
