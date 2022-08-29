package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestQuickSort {
	private Logger log = LoggerFactory.getLogger(getClass().getName());
	@Test
	public void testQuickSort() {
		int[] input = new int[] { 10, 80, 30, 90, 40, 50, 70 };
		QuickSort quickSort = new QuickSort();
		int[] result = quickSort.quicksort(input);
		log.info("result: {}", result);
	}
}
