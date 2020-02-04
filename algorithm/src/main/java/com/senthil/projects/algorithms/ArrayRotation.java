package com.senthil.projects.algorithms;

import java.util.Arrays;

public class ArrayRotation {

    int[] buffer;
    int inputSize;
    int rotate;


    public int[] rotate(int[] input, int rotation) {
        int[] result;
        inputSize = input.length;
        if (rotation < 0) {
            this.rotate = rotation*-1;
            buffer = new int[rotate];
            result = negativeRotation(input);
        } else {
            this.rotate = rotation;
            buffer = new int[rotate];
            result = positiveRotate(input);
        }
        return result;
    }

    private int[] positiveRotate(int[] input) {
        //1. Buffer
        for (int i = 0; i < rotate; i++) {
            buffer[i] = input[i];
        }

        System.out.println(Arrays.toString(buffer));
        int inputSize = input.length;

        //2. Rotate r-1-th position 0 r-th position to 1 and so on until less than inputSize - rotation
        for (int i = 0; i < inputSize-rotate; i++) {
            input[i] = input[rotate+i];
        }

        //3. Copy the buffer to the end
        for (int i = 0; i < rotate; i++) {
            input[inputSize-rotate+i] = buffer[i];
        }

        return input;
    }

    private int[] negativeRotation(int[] input) {

        //1. Buffer
        for (int i = inputSize-rotate; i > inputSize-1; i++) {
            buffer[i] = input[i];
        }
        return null;
    }

}
