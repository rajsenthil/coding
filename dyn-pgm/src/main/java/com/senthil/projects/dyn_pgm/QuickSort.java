package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickSort {

	private Logger log = LoggerFactory.getLogger(getClass().getName());

	int[] input = null;
	int len = -1;

	public QuickSort(int[] input) {
		this.input = input;
		this.len = input.length;
	}

	public int[] quicksort() {
		return quickSortHelper(0, len - 1);
	}

	public int[] quickSortHelper(int lo, int hi) {
		log.info("quickSortHelper: lo: {}, hi: {}", lo, hi);
		if (lo < hi) {
			int partPos = partition(lo, hi);
			log.info("partition position: {}", partPos);
			log.info("Calling with lo: {} and partPos-1: {}", lo, partPos - 1);
			quickSortHelper(lo, partPos - 1);
			log.info("Calling with partPos+1: {} and hi: {}", lo, partPos - 1);
			quickSortHelper(partPos + 1, hi);
			log.info("Done with lo: {} and hi: {}", lo, hi);
		}
		return input;
	}

	public int partition(int lo, int hi) {
		int pivot = input[hi];

		log.info("Input: {}, lo: {}, hi: {}", input, lo, hi);
		for (int j = lo; j < hi; j++) {
			if (input[j] <= pivot) {
				log.info("Swapping {} with {}", input[j], input[lo]);
				swap(j, lo);
				lo++;
			}
		}
		log.info("after iteraion: {}, lo: {}", input, lo);
		// Shift the elements from i towards rights
		for (int j = hi; j > lo; j--) {
			input[j] = input[j - 1];
		}
		log.info("after shifting towards right: {}", input);
		input[lo] = pivot;
		log.info("final input: {} and pivot position: {}", input, lo);
		return lo;
	}

	private void swap(int _1, int _2) {
		int temp = input[_1];
		input[_1] = input[_2];
		input[_2] = temp;
	}
}
