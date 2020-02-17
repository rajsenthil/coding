package com.senthil.projects.solutions;

import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    @Test
    public void testLonestSubstringV1() {
        String str = "abcabcbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int count = longestSubstring.findLongestSubstring(str);
        System.out.println("Longest CHar count = "+count);
    }

    @Test
    public void testLonestSubstringV2() {
        String str = "a";
        LongestSubstring longestSubstring = new LongestSubstring();
        int count = longestSubstring.findLongestSubstring(str);
        System.out.println("Longest CHar count = "+count);
    }
}
