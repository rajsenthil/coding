package com.senthil.projects.solutions;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClimbingNStairsV1Test {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Test
    public void testClimbStairs(){
        int stairs = 45;
        ClimbingNStairsV1 app = new ClimbingNStairsV1();
        logger.info("Total ways to climb {} stairs is {} ", stairs, app.climbStair(stairs));
    }
}
