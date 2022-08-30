package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPartition {

	private static Logger log = LoggerFactory.getLogger(TestPartition.class.getName());

	@Test
	public void testPartition() {
		int[] input = new int[] { 10, 80, 30, 90, 40, 50, 70 };
		input = new int[] { 30, 10 };
		//input = new int[] { 10 };
		int pivot = 70;
		log.info("input: {}", input);
		Partition app = new Partition();
		int result = app.partition(input);
		log.info("result = {}", result);
	}
}
