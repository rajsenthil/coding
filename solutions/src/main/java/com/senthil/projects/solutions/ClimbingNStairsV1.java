package com.senthil.projects.solutions;

public class ClimbingNStairsV1 {

    public int climbStair(int n){
        if (n ==1) return 1;
        if (n == 2) return 2;
        return climbStair(n-2)+climbStair(n-1);
    }
}
