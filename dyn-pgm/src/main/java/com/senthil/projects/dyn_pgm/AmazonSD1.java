package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonSD1 {

	private Logger log = LoggerFactory.getLogger(getClass().getName());
	/**
	 * Given: input = [3,9,4,2,16]
	 * 1. initialize currElemPos = 0,count=0,maxCount=0;
	 * 2. Search for square of input[i] in the array 0 <= i <= n-1.
	 * 3. If exists,
	 * i. set currElemPos = i
	 * ii. count++
	 * iii. repeat 2
	 * 4. If not exists move forward
	 * 5. After search ends check if count > maxCount.
	 * i. If it is then maxCount = count, count = 0
	 * ii. else count = 0
	 **/
	int count = 0, maxCount = 0, size = 0;

	public int optimalBags(int[] input) {
		this.size = input.length;
		for (int index = 0; index < input.length; index++) {
			optimalBagsHelper(input, index);
			if (count > maxCount)
				maxCount = count;
			count = 0;
		}
		log.info("Max count: {}", maxCount);		
		return maxCount < 2 ? 0 : maxCount+1;
	}

	private int optimalBagsHelper(int[] input, int currElemPos) {
		log.info("params currElemPos: {}, input[{}]: {}", currElemPos, currElemPos, input[currElemPos]);
		int valSquare = input[currElemPos]*input[currElemPos];
		log.info("valSquare: {}", valSquare);
		for (int i = 0; i < size; i++){
			if (input[i] == valSquare){
				count++;
				optimalBagsHelper(input, i);
			}
		}
		log.info("count: {}", count);
		return count;
	}
}
