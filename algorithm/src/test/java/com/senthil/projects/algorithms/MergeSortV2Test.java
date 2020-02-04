package com.senthil.projects.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortV2Test {

    @Test
    public void splitItemsInArray() {
        int[] items = {11, 2, 85, 5, 17, 37, 1};
        MergeSortV2 mergeSortV2 = new MergeSortV2();
        int startPos = 2;
        int endPos = 6;
        int[] result = mergeSortV2.splitItems(items, startPos, endPos);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void mergeTwoSortedArrays() {
        int[] array1 = {5, 17, 85};
        int[] array2 = {2, 11};
        MergeSortV2 mergeSortV2 = new MergeSortV2();
        int[] mergedArray = mergeSortV2.sortAndMerge(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }

    @Test
    public void sortArray() {
        int[] items = {11, 2, 85, 5, 17, 37, 1};
        MergeSortV2 mergeSortV2 = new MergeSortV2();
        int[] mergedArray = mergeSortV2.sort(items);
        System.out.println(Arrays.toString(mergedArray));
    }
}
