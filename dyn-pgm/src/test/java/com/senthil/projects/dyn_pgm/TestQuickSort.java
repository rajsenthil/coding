package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestQuickSort {
	private Logger log = LoggerFactory.getLogger(getClass().getName());

	@Test
	public void testQuickSort() {
		int[] input = new int[] { 10, 80, 30, 90, 40, 50, 70 };
		//input = new int[] { 10, 80, 30 };
		//input = new int[] { 10, 30, 80 };
		//input = new int[] { 10, 30 };
		//input = new int[] { 30, 10 };
		//input = new int[] { 10 };
		QuickSort quickSort = new QuickSort(input);
		log.info("Input: {}", input);
		 int[] result = quickSort.quicksort();
		//int result = quickSort.partition(0, input.length - 1);
		log.info("result: {}", result);
	}
}
