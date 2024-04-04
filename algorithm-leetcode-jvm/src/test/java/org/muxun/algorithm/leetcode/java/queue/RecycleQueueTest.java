package org.muxun.algorithm.leetcode.java.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-19 19:51
 */
public class RecycleQueueTest {

    private RecycleQueue recycleQueue;

    public void constructor() {
        this.recycleQueue = new RecycleQueue(3);
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertTrue(this.recycleQueue.isEmpty());
    }

    @Test
    public void testIsFull() {
        Assertions.assertFalse(this.recycleQueue.isFull());
    }

    @Test
    public void testEnqueue() {
        Assertions.assertTrue(this.recycleQueue.enQueue(1));
        Assertions.assertTrue(this.recycleQueue.enQueue(2));
        Assertions.assertTrue(this.recycleQueue.enQueue(3));
        Assertions.assertFalse(this.recycleQueue.enQueue(4));
        Assertions.assertEquals(3, this.recycleQueue.Rear());
        Assertions.assertTrue(this.recycleQueue.isFull());
        Assertions.assertTrue(this.recycleQueue.deQueue());
        Assertions.assertTrue(this.recycleQueue.enQueue(4));
        Assertions.assertEquals(4, this.recycleQueue.Rear());
    }

    public void print() {

    }
}
