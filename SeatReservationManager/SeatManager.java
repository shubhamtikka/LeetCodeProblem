package SeatReservationManager;

import java.util.PriorityQueue;

class SeatManager {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    int lastIndex = 0;

    public SeatManager(int n) {
    }

    public int reserve() {
        if (minHeap.isEmpty())
            return ++lastIndex;
        return minHeap.poll();
    }

    public void unreserve(int seatNumber) {
        minHeap.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */