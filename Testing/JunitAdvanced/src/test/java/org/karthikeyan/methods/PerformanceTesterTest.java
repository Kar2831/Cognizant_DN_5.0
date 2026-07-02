package org.karthikeyan.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    PerformanceTester performanceTester = new PerformanceTester();

    @Test
    @Timeout(4)
    public void testPerformance() throws InterruptedException{
        performanceTester.performTask();
    }
}
