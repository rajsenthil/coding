package com.senthil.projects.solutions;

public class TwoSum {

    int level = 0; // for two sum it should not cross 2 and for 3 sum it is 3
    int[] results = new int[2];

    public int[] twoSums(int[] nums, int target) {
        twoSums(nums, 0, target);
        return results;
    }

    private void twoSums(int[] nums, int startPos, int target) {
        if (level > 0) return;
        for (int i = startPos; i < nums.length - 1; i++) {
            if (nums[i] < target) {
                results[level++] = i;
                int newTarget = target - nums[i];
                twoSums(nums, i, newTarget);
            }
        }
    }
}

