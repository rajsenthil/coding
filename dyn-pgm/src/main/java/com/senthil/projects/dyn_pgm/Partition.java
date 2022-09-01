package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Partition {

	private static Logger log = LoggerFactory.getLogger(Partition.class.getName());

	public int partition(int[] input) {
		int len = input.length;
		int lo = 0, hi = len - 2;
		int pivot = input[len - 1];

		while (true) {
			while (lo < len - 1 && input[lo] < pivot)
				lo++;

			while (hi > 0 && input[hi] > pivot)
				hi--;

			if (lo >= hi)
				break;
			int temp = input[lo];
			input[lo] = input[hi];
			input[hi] = temp;
			log.info("lo: {}, hi: {}, input: {}", lo, hi, input);
		}
		log.info("Shift the item in {} towards right starting from lo: {}", input, lo);
		for (int i = len - 1; i > lo; i--) {
			input[i] = input[i - 1];
		}
		input[lo] = pivot;
		log.info("items partitioned as: {}", input);
		return lo;
	}

	public int partition2(int[] input) {
		int len = input.length;
		int lo = 0, hi = len - 2, pivot = input[len - 1];
		log.info("lo: {}, hi: {}, pivot: {}, input: {}", lo, hi, pivot, input);
		for (int k = 0; k <= hi; k++) {
			if (input[k] <= pivot) {
				log.info("Swapping element {} with {}", input[k], input[lo]);
				swap(lo, k, input);
				lo++;
			}
		}
		// sfift the position from i+1 to left
		for (int k = len - 1; k > lo; k--) {
			input[k] = input[k - 1];
		}
		input[lo] = pivot;
		log.info("Final array: {} with pivot position: {}", input, lo + 1);
		return lo;
	}

	private void swap(int _1, int _2, int[] array) {
		int temp = array[_1];
		array[_1] = array[_2];
		array[_2] = temp;
	}
}
