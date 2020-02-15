package com.senthil.projects.solutions;

public class BusiestTimeInMallV2 {

    public static int findBusiestPeriod(int[][] data) {
        int maxCount = 0;
        int maxCountTime = 0;
        int currentCount = 0;
        int currentTime = 0;
        int prevTime = data[0][0];
        for (int i = 0; i < data.length; i++) {
            int[] current = data[i];
            currentTime=current[0];
            if (current[0] == prevTime) {
                // Add or subtract to the current count
                currentCount += current[2] > 0 ? current[1] : -1*current[1];
            } else if (currentCount > maxCount) {
                maxCountTime = prevTime;
                maxCount = currentCount;
                currentCount += current[2] > 0 ? current[1] : -1*current[1];
                prevTime = currentTime;
            }
        }
        return maxCountTime;
    }
}
