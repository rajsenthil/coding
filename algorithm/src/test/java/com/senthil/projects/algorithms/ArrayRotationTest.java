package com.senthil.projects.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayRotationTest {

    int[] input = {1, 2, 3, 4, 5, 6};
    ArrayRotation arrayRotation = new ArrayRotation();

    @Test
    public void rotateArrayByTwoPosition() {
        int[] rotated = arrayRotation.rotate(input, 2);
        int[] expected = {3, 4, 5, 6, 1, 2};
        System.out.println("Rotated:"+Arrays.toString(rotated));
        assert Arrays.equals(rotated, expected);
    }

    @Test
    public void rotateArrayZeroPosition() {
        int[] rotated = arrayRotation.rotate(input, 0);
        assert Arrays.equals(rotated, input);
    }

    @Test
    public void rotateArrayNegativePosition() {
        int[] rotated = arrayRotation.rotate(input, -3);
        int[] expected = {4, 5, 6, 1, 2, 3};
        assert Arrays.equals(rotated, expected);
        System.out.println(Arrays.toString(rotated));
    }
}
