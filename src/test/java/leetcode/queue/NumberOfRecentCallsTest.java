package leetcode.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfRecentCallsTest {

    @Test
    public void testPing() throws Exception {
        NumberOfRecentCalls.RecentCounter counter = new NumberOfRecentCalls.RecentCounter();

        assertEquals(1, counter.ping(1));
        assertEquals(2, counter.ping(100));
        assertEquals(3, counter.ping(3001));
        assertEquals(3, counter.ping(3002));
    }
}