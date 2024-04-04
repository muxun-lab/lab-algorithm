package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：61
 * 题目：旋转链表
 * 详情：给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * @author 慕勋
 * @created 2020-03-11
 */
public class RotateRight {

    /**
     * 思路：将k化成链表节点个数内的移动次数
     * 因为超过链表节点个数的移动次数重复的，无效的
     * @param head 给定链表的头结点
     * @param k    移动节点的次数
     * @return 移动给定次数后链表的头结点
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (k < 1) {
            return head;
        }
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head, q = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        int real = k % count;
        while (real > 0) {
            q = step(q);
            real--;
        }
        return q;
    }

    /**
     * 将尾节点置为头结点
     * @param head 链表的头节点
     * @return 新的链表的头节点
     */
    private ListNode step(ListNode head) {
        ListNode p = head;
        ListNode previous = new ListNode(0);
        while (p.next != null) {
            previous = p;
            p = p.next;
        }
        // 此时p节点为最后一个节点，需要将最后一个节点置为head节点
        int value = p.val;
        previous.next = null;
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        return newHead;
    }

    /**
     * 思路：先连成环，然后在指定位置断还
     * @param head 给定链表的头结点
     * @param k    移动节点的次数
     * @return 移动给定次数后链表的头结点
     */
    public ListNode rotateRightUpgrade(ListNode head, int k) {
        if (k < 1) {
            return head;
        }
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        int count = 1;
        while (p.next != null) {
            p = p.next;
            count++;
        }
        p.next = head;
        int real = k % count;
        int headIndex = count - real - 1;
        p = head;
        while (headIndex > 0) {
            p = p.next;
            headIndex--;
        }
        head = p.next;
        p = head;
        while (count - 1 > 0) {
            p = p.next;
            count--;
        }
        p.next = null;
        return head;
    }
}
