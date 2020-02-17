package com.senthil.projects.solutions;

public class LongestSubstring {
    public int findLongestSubstring(String str) {
        if (str == null || "".equals(str.trim())) return 0;
        if (str.length() == 1) return 1;
        int maxCount = 0;
        int currentCount = 1;
        int length = str.length();
        for (int i = 0, j = i+1; i < length && j < length;) {
            for (int k = i; k < j; k++) {
                if (str.charAt(k) == str.charAt(j)) {
                    maxCount = (maxCount < currentCount) ? currentCount : maxCount;
                    i = j;
                    j = i+1;
                    currentCount=1;
                    k = i;
                }
            }
            currentCount++;
            j++;
        }
        return maxCount;
    }
}
