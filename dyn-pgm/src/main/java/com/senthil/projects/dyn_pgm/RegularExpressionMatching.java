package com.senthil.projects.dyn_pgm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegularExpressionMatching {
	private Logger log = LoggerFactory.getLogger(getClass().getName());

	public boolean isMatch(String s, String p) {
		log.info("input: " + s + ", pattern: " + p);
		if (p.startsWith("*"))
			throw new IllegalArgumentException("Pattern must not start with *: " + p);
		return isMatchHelper(s, p, 0, 0);
	}

	public boolean isMatchHelper(String input, String pattern, int inputPos, int patternPos) {
		System.out.println("inputPos: " + inputPos + ", patternPos: " + patternPos);

		if (inputPos >= input.length() && patternPos >= pattern.length()) {
			return true;
		}

		if (patternPos >= pattern.length()) {
			return false;
		}

		char patternChar = patternPos < pattern.length() ? pattern.charAt(patternPos) : '\0';
		char inputChar = inputPos < input.length() ? input.charAt(inputPos) : '\0';
		char nextPatternChar = patternPos < pattern.length() - 1 ? pattern.charAt(patternPos + 1) : '\0';
		boolean isCharMatch = inputPos < input.length() && (inputChar == patternChar || patternChar == '.');
		System.out.println("isCharMatch: " + isCharMatch);
		if (nextPatternChar == '*') {
			System.out.println("Next char is '*'");
			return isCharMatch && isMatchHelper(input, pattern, inputPos + 1, patternPos) ||
					isMatchHelper(input, pattern, inputPos, patternPos + 2);
		} else if (isCharMatch) {
			return isMatchHelper(input, pattern, inputPos + 1, patternPos + 1);
		}

		return false;
	}
}
