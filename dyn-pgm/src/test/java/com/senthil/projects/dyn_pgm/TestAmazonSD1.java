package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAmazonSD1 {
	private Logger log = LoggerFactory.getLogger(getClass().getName());

	@Test
	public void testAmazonSD1() {
		int[] input = { 3, 9, 4, 2, 16 };
		input = new int[] { 2, 4, 256, 16 };
		input = new int[] { 2, 4, 3, 81, 9, 6561 };
		//input = new int[] { 2, 4, 16, 256, 6561 };
		AmazonSD1 app = new AmazonSD1();
		int result = app.optimalBags(input);
		log.info("input: {}, result: {}", input, result);
	}
}
