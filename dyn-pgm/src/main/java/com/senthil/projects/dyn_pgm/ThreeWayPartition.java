package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeWayPartition {
	private Logger log = LoggerFactory.getLogger(getClass().getName());

	public int[] threeWayPartition(int[] input) {
		int len = input.length, lo = 0, hi = len - 1;
		int i = lo, j = hi;
		// let the group be 0,1,2 in that order
		for (int k = i; k <= j; k++) {
			if (input[k] == 0) {
				swap(i, k, input);
				i++;
			} else if (input[k] == 2) {
				swap(k, j, input);
				j--;
			}
			log.info("after iteration {}, input: {}", k, input);
		}
		return input;
	}

	private void swap(int _1, int _2, int[] input) {
		log.info("swap: input[{}]: {}, input[{}]: {}", _1, input[_1], _2, input[_2]);
		int temp = input[_1];
		input[_1] = input[_2];
		input[_2] = temp;
		log.info("after swap, input: {}", input);
	}
}
