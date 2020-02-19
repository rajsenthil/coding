package com.senthil.projects.solutions;

import org.junit.jupiter.api.Test;

public class TwoSortedArrayMedianTest {

    @Test
    public void testTwoArrayMedian() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        TwoSortedArrayMedian twoArrayMedian = new TwoSortedArrayMedian();
        double median = twoArrayMedian.findMedianBruteForce(nums1, nums2);
        System.out.println("Median:" + median);
    }

    @Test
    public void testTwoArrayMedian2() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};

        TwoSortedArrayMedian twoArrayMedian = new TwoSortedArrayMedian();
        double median = twoArrayMedian.findMedianBruteForce(nums1, nums2);
        System.out.println("Median:" + median);
    }

    @Test
    public void testTwoArrayMedian3() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        TwoSortedArrayMedian twoArrayMedian = new TwoSortedArrayMedian();
        double median = twoArrayMedian.findMedianBruteForce(nums1, nums2);
        System.out.println("Median:" + median);
    }
}
