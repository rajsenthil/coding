package com.senthil.projects.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void twoSumofTarget9() {
        int[] array = {2, 7, 11, 15};
        int target = 13;
        int[] expected = {2, 11};

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSums(array, target);
        System.out.println(Arrays.toString(result));
    }
}
