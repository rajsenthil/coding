package com.senthil.projects.dyn_pgm;

import org.junit.jupiter.api.Test;

public class TestRegularExpressionMatching {

	@Test
	public void testReguleExpressionMatching() {
		String input = "aab";
		String pattern = "c*a*b";
		//input = "aaa";
		//pattern = "ab*a*c*a";
		//input = "ab";
		//pattern = ".*c";
		//input = "aa";
		//pattern = "a";
		//input = "aa";
		//pattern = "a*";		
		//input = "mississippi";
		//pattern = "mis*is*ip*.";
		RegularExpressionMatching app = new RegularExpressionMatching();
		boolean result = app.isMatch(input, pattern);
		System.out.println("result: " + result);
	}
}

/**
 * Given an input string s and a pattern p, implement regular expression
 * matching with support for '.' and '*' where:
 * 
 * '.' Matches any single character.​​​​
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 * 
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore,
 * by repeating 'a' once, it becomes "aa".
 * Example 3:
 * 
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 20
 * 1 <= p.length <= 30
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '.', and '*'.
 * It is guaranteed for each appearance of the character '*', there will be a
 * previous valid character to match.
 * 
 **/

/**
 * input: aa, pattern: a*
 * inputPos: 0, patternPos: 0
 * patternPos: 0, inputPos: 0, input char: a, patternChar: a
 * Recurrence call
 * inputPos: 1, patternPos: 1
 * patternPos: 1, inputPos: 1, input char: a, patternChar: *
 * Returning false2
 **/
