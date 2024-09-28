package leetcode.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfRecentCalls {

    static class RecentCounter {
        Queue<Integer> requestQueue;

        public RecentCounter() {
            requestQueue = new ArrayDeque<>();
        }

        public int ping(int t) {
            requestQueue.add(t);
            while (requestQueue.peek() < t - 3000) requestQueue.poll();
            return requestQueue.size();
        }
    }
}
