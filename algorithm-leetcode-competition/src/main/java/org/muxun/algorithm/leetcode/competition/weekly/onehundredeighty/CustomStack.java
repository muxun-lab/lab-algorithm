package org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty;

import java.util.LinkedList;

/**
 * 题号：5357
 * 题目：设计一个支持增量的操作栈
 * 详情：请你设计一个支持下述操作的栈
 * 实现自定义栈类 CustomStack：
 * * CustomStack(int maxSize)：用 maxSize 初始化对象，maxSize 是栈中最多能容纳的元素数量，栈在增长到 maxSize 之后则不支持 push 操作
 * * void push(int x)：如果栈还未增长到 maxSize ，就将 x 添加到栈顶
 * * int pop()：返回栈顶的值，或栈为空时返回 -1
 * * void inc(int k, int val)：栈底的 k 个元素的值都增加 val 。如果栈中元素总数小于 k ，则栈中的所有元素都增加 val
 * @author sunshine
 * @created 2020-03-15
 */
public class CustomStack {

    private final LinkedList<Integer> stack;

    private final int maxSize;

    private int size = 0;

    public CustomStack(int maxSize) {
        stack = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (size >= maxSize) {
            return;
        }
        size++;
        this.stack.add(x);
    }

    public int pop() {
        if (this.stack.isEmpty()) {
            return -1;
        }
        size--;
        return this.stack.removeLast();
    }

    public void increment(int k, int val) {
        if (this.stack.isEmpty()) {
            return;
        }
        int maxIndex = Math.min(k, size);
        for (int i = 0; i < maxIndex; i++) {
            int current = this.stack.get(i);
            this.stack.set(i, current + val);
        }
    }
}
