package org.muxun.algorithm.leetcode.java.design;

import java.util.LinkedList;

/**
 * 题号: 225
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/implement-stack-using-queues">用队列实现栈</a>
 * <p>
 * 详情: 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * <p>
 * 实现 MyStack 类：
 * * void push(int x) 将元素 x 压入栈顶。
 * * int pop() 移除并返回栈顶元素。
 * * int top() 返回栈顶元素。
 * * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode225 {

    LinkedList<Integer> first;
    LinkedList<Integer> second;

    public LeetCode225() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        second.offer(x);
        while (!first.isEmpty()) {
            second.offer(first.poll());
        }
        LinkedList<Integer> temp = first;
        first = second;
        second = temp;
    }

    public int pop() {
        return first.poll();
    }

    public int top() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
