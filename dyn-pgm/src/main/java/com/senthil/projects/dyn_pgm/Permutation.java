package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Permutation {

	private Logger log = LoggerFactory.getLogger(getClass().getName());
	int[] input = null;
	int size = -1;
	int count = 0;

	public int[] permute(int[] input) {
		this.input = input;
		this.size = input.length;
		permuteHelper(size);
		return input;
	}

	private void permuteHelper(int newSize) {
		log.info("newSize: {}", newSize);
		// Base condition - when new size 1, there is no more combinations
		// at this point display it and also rotate
		if (newSize == 1) {
			count++;
			display();
			return;
		}
		for (int i = 1; i <= newSize; i++) {
			log.info("i: {}", i);
			permuteHelper(newSize - 1);
			// last element, print it and return
			// if (newSize == 2)
			// display();
			rotate(newSize);
		}

		log.info("Count: {}", count);
	}

	private void display() {
		log.info("display {}", input);
	}

	private void rotate(int newSize) {
		log.info("Rotate input: {}, with newsize: {}", input, newSize);
		int pos = size - newSize;
		int temp = input[pos];
		for (int k = pos; k < size - 1; k++) {
			input[k] = input[k + 1];
		}
		input[size - 1] = temp;
		log.info("After rotation, input: {}", input);
	}
}
