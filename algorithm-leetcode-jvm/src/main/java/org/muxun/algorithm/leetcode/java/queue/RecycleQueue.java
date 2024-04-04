package org.muxun.algorithm.leetcode.java.queue;

/**
 * 循环队列
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-19 18:18
 */
public class RecycleQueue {

    private int front;

    private int end;

    private final int[] recycleQueue;

    public RecycleQueue(int size) {
        this.front = 0;
        this.end = 0;
        this.recycleQueue = new int[size + 1];
    }

    public boolean isEmpty() {
        if (this.recycleQueue == null) {
            return true;
        }
        return this.front == this.end;
    }

    public boolean isFull() {
        if (this.recycleQueue == null) {
            return false;
        }
        return this.front == (this.end + 1) % this.recycleQueue.length;
    }

    public boolean enQueue(int value) {
        if (this.isFull()) {
            return false;
        }
        this.recycleQueue[this.end] = value;
        this.end = (this.end + 1) % this.recycleQueue.length;
        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty()) {
            return false;
        }
        this.front = (this.front + 1) % this.recycleQueue.length;
        return true;
    }

    public int Front() {
        if (this.isEmpty()) {
            return -1;
        }
        int temp = this.recycleQueue[this.front];
        return temp;
    }

    public int Rear() {
        if (this.isEmpty()) {
            return -1;
        }
        int postion = (this.end - 1) % this.recycleQueue.length;
        if (postion < 0) {
            postion = postion + this.recycleQueue.length;
        }
        return this.recycleQueue[postion];
    }

}
