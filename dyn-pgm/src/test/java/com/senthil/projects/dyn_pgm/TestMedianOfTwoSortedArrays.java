package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;

public class TestMedianOfTwoSortedArrays {
	// @Test
	// public void testBruteForce() {
	// int[] array1 = new int[] { 1, 3 };
	// int[] array2 = new int[] { 2 };
	// array1 = new int[] { 1, 2 };
	// array2 = new int[] { 3, 4 };
	// // array1 = new int[] { -5, 3, 6, 12, 15 };
	// // array2 = new int[] { -12, -10, -6, -3, 4, 10 };
	// // array1 = new int[] { 2, 3, 5, 8 };
	// // array2 = new int[] { 10, 12, 14, 16, 18, 20 };
	// array1 = new int[] { 1, 4, 5 };
	// array2 = new int[] { 2, 3 };
	// array1 = new int[] { 1, 2, 3, 4 };
	// array2 = new int[] { 5, 6 };
	// MedianOfTwoSortedArrays medianOfTwoSortedArrays = new
	// MedianOfTwoSortedArrays();
	// double result = medianOfTwoSortedArrays.medianByBruteForce(array1, array2);
	// System.out.println("Result: " + result);
	//

	@Test
	public void testFindMedian() {
		int[] array1 = new int[] { 1, 3 };
		int[] array2 = new int[] { 2 };
		array1 = new int[] { 1, 2 };
		array2 = new int[] { 3, 4 };
		//array1 = new int[] { -5, 3, 6, 12, 15 };
		//array2 = new int[] { -12, -10, -6, -3, 4, 10 };
		// array1 = new int[] { 2, 3, 5, 8 };
		// array2 = new int[] { 10, 12, 14, 16, 18, 20 };
		// array1 = new int[] { 1, 4, 5 };
		// array2 = new int[] { 2, 3 };
		array1 = new int[] { 1, 2, 3, 4 };
		array2 = new int[] { 5, 6 };
		array1 = new int[] { 1, 3 };
		array2 = new int[] { 2 };
		//array1 = new int[] { 1 };
		//array2 = new int[] { 2 };
		array1 = new int[]{1,2,3,5};
		array2 = new int[]{4};
		//array1 = new int[]{2};
		//array2 = new int[]{};
		MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
				double result = medianOfTwoSortedArrays.findMedianByBinary(array1, array2);
		//		double result = medianOfTwoSortedArrays.findMedianSortedArrays(array1, array2);
		System.out.println("Result2: " + result);
	}
}
