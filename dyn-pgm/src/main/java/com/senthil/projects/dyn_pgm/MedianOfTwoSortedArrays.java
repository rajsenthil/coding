package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MedianOfTwoSortedArrays {
	private static final Logger log = LoggerFactory.getLogger(MedianOfTwoSortedArrays.class);

	public double medianByBruteForce(int[] nums1, int[] nums2) {
		int len1 = nums1.length, len2 = nums2.length;
		int total = len1 + len2;
		int[] buffer = new int[total];
		int idx1 = 0, idx2 = 0;
		while (idx1 < len1 && idx2 < len2) {
			if (nums1[idx1] < nums2[idx2]) {
				buffer[idx1 + idx2] = nums1[idx1];
				idx1++;
			} else {
				buffer[idx1 + idx2] = nums2[idx2];
				idx2++;
			}
		}
		while (idx1 < len1) {
			buffer[idx1 + idx2] = nums1[idx1];
			idx1++;
		}
		while (idx2 < len2) {
			buffer[idx1 + idx2] = nums2[idx2];
			idx2++;
		}

		double median = 0.0;
		int mid = total / 2;
		if (total % 2 == 0) {
			median = (buffer[mid - 1] + buffer[mid]) / 2.0;
		} else {
			median = buffer[mid];
		}
		return median;
	}

	/**
	 * This method follow a indexing for partitioning.
	 * Do not take the index for partitioning. It will become complex in boundary
	 * condition.
	 * In this way(using index for partioning), the first element is index = 0.
	 * So when index=0, there is no left part. If index = 0, left part is lowest
	 * possible value.
	 * Also when index = length of an array, there is no right part. If index =
	 * length, the right part is highest possible value
	 **/
	public double findMedianByBinary(int[] nums1, int[] nums2) {
		int len1 = nums1.length, len2 = nums2.length;        
        if (len1 > len2) findMedianByBinary(nums2, nums1);
        int total = len1+len2;
        boolean isEven = total%2==0?true:false;
        double median = 0.0;
        if (len1 == 0 && len2 == 0) return 0.0;
        if (len1 == 0 && len2 > 0) {
            median = isEven? (nums2[len2/2-1] + nums2[len2/2])/2.0 : nums2[len2/2];
            return median;
        }
    
        int hi = len1, lo = 0;        
        System.out.println("len1: "+len1+", len2: "+len2+", total: "+total+", ieEven: "+isEven+", hi: "+hi+", lo: "+lo);        
        while (lo <= hi) {
            int part1 = lo + (hi-lo)/2;
            int part2 = total/2 - part1;
            System.out.println("part1: "+part1+", part2: "+part2);
            int left1 = part1 == 0 ? Integer.MIN_VALUE : nums1[part1-1];
            int right1 = part1 == len1 ? Integer.MAX_VALUE : nums1[part1];
            int left2 = part2 == 0 ? Integer.MIN_VALUE : nums2[part2-1];
            int right2 = part2 == len2 ? Integer.MAX_VALUE : nums2[part2];
            System.out.println("left1: "+left1+", right1: "+right1+", left2: "+left2+", right2: "+right2);
            if (left1 <= right2 && left2 <= right1) {
                System.out.println("Median found");
                median = isEven? (Math.max(left1,left2)+Math.min(right1,right2))/2.0 : Math.min(right1,right2);
                return median;
            } else if (left1 > right2) {
                System.out.println("Moving left");
                hi = part1 - 1;
            } else {
                System.out.println("Moving right");
                lo = part1 + 1;
            }
        }        
        return 0.0;		
	}
}
