package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPermutation {
	private Logger log = LoggerFactory.getLogger(getClass().getName());
	@Test
	public void testPermutation(){
		int[] input = { 1, 2, 3 };
		Permutation permutation = new Permutation();
		permutation.permute(input);
	}
}
