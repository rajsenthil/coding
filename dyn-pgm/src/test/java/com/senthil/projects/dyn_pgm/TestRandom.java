package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRandom {
	private final Logger log = LoggerFactory.getLogger(getClass().getName());
	int[] array1 = new int[]{};
	@Test
	public void testArrayNull(){
		boolean isNull = array1 == null ? true : false;
		int len = !isNull?array1.length: -1;
		log.info("array1: {} is null? {} with length: {}", array1, isNull, len);
	}
}
