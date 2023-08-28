package StackUsingQueues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class StackUsingQueues {

    Queue<Integer> queue;
    int top;

    public StackUsingQueues() {
        queue = new LinkedBlockingQueue<Integer>();
    }

    public void push(int x) {
        this.top = x;
        this.queue.add(x);
    }

    public int pop() {
        int N = queue.size();
        for (int i = 0; i < N - 1; i++) {
            this.top = this.queue.peek();
            this.queue.add(this.queue.remove());
        }

        return this.queue.remove();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return !(queue.size() > 0);
    }

}
