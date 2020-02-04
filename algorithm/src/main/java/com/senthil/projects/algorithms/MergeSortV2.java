package com.senthil.projects.algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MergeSortV2 {

    private static final Logger log = LoggerFactory.getLogger(MergeSortV2.class.getName());


    public int[] splitItems(int[] items, int startPos, int endPos) {
        if (startPos >= endPos) return items;
        if (endPos > items.length-1) throw new RuntimeException("End position is greater than the item size");
        int length = endPos-startPos+1;
        int[] subset = new int[length];
        for(int i = 0; i < length; i++) {
            subset[i] = items[startPos+i];
        }
        return subset;
    }

    public int[] sortAndMerge(int[] array1, int[] array2) {
        int[] buffer = new int[array1.length+array2.length];

        int i = 0; //Starting pointer for large array
        int j = 0; //Starting pointer for shorter array
        int k = 0; //Current index of the buffer

        while (i < array1.length && j < array2.length) {
            buffer[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];
        }

        // if array1 has any remaining items, move them to buffer
        while (i < array1.length) buffer[k++] = array1[i++];

        // if array2 has any remaining items, move then to buffer
        while (j < array2.length) buffer[k] = array2[j++];

        log.info("Buffer: {}", Arrays.toString(buffer));
        return buffer;
    }

    public int[] sortAndMerge(int[] array, int startPos, int endPos) {
        log.info("sortAndMerge start and end positions, startPos:{}, endPosd: {}", startPos, endPos);
        int[] buffer = new int[endPos-startPos+1];

        int i = startPos; //Starting pointer for large array
        int mid = (startPos+endPos)/2;
        int j = mid+1; //Starting pointer for shorter array
        int k = 0; //Current index of the buffer

        while (i <= mid && j <= endPos) {
            buffer[k++] = array[i] < array[j] ? array[i++] : array[j++];
        }

        // if array has any remaining items on its left, move them to buffer
        while (i <= mid) buffer[k++] = array[i++];

        // if array has any remaining items on its right, move then to buffer
        while (j <= endPos) buffer[k] = array[j++];

        log.info("Buffer: {}", Arrays.toString(buffer));

        for (int index = startPos; index <= endPos; index++) array[index] = buffer[index-startPos];

        return array;
    }

    private int[] mergeSort(int[] items, int startPos, int endPos) {
        //1. Split items recursively mid of start and end position
        if (startPos >= endPos) return items;

        int mid = (endPos+startPos)/2;
        log.info("Items:{}, startPos:{}, mid: {}, endPos:{}", Arrays.toString(items), startPos, mid, endPos);
        mergeSort(items, startPos, mid); // Split recursively left items
        mergeSort(items, mid+1, endPos); // Split recursively right items

        // 2. Merge the items
        return sortAndMerge(items, startPos, endPos);

    }

    public int[] sort(int[] items) {
        return mergeSort(items, 0, items.length-1);
    }
}
