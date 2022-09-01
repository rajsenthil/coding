package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestThreeWayPartition {
	private Logger log = LoggerFactory.getLogger(getClass().getName());

	@Test
	public void testThreeWayPartition() {
		int[] input = { 0, 2, 1, 2, 1, 0 };
		input = new int[]{ 0, 2, 1 };
		log.info("input: {}", input);
		ThreeWayPartition app = new ThreeWayPartition();
		int[] result = app.threeWayPartition(input);
		log.info("ThreewayPartitioning result: {}", result);
	}
}
