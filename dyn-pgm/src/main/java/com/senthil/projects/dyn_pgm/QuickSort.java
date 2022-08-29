package com.senthil.projects.dyn_pgm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickSort {

	private Logger log = LoggerFactory.getLogger(getClass().getName());

	int[] input = null;
	int len = -1;

	public int[] quicksort(int[] input) {
		this.input = input;
		this.len = input.length;
		return quickSortHelper(input);
	}

	public int[] quickSortHelper(int[] input) {
		return null;
	}

	public int[] partition(int lo, int hi, int[] input) {
		int pivot = input[input.length - 1];
		while (lo <= hi) {
			while (input[lo] <= pivot)
				lo++;
			while (input[hi] > pivot)
				hi--;
			// swap
			int temp = input[lo];
			input[lo] = input[hi];
			input[hi] = temp;
		}
		for (int i = input.length - 1; i > lo + 2; i--){
			input[i] = input[i - 1];
		}
		input[lo + 1] = pivot;
		return input;
	}
}
