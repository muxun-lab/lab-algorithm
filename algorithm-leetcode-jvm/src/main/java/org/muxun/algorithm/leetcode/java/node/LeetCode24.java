package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：24
 * <p>
 * 题目：<a href="https://leetcode.cn/problems/swap-nodes-in-pairs">两两交换链表中的节点</a>
 * <p>
 * 详情：给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @author 慕勋
 * @created 2020-03-12
 */
public class LeetCode24 {

    /**
     * 思路：迭代
     * @param head 给定链表的头节点
     * @return 两两交换后的链表头节点
     */
    public ListNode swapPairs(ListNode head) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode node = p;
        while (node.next != null && node.next.next != null) {
            // 记录两个端点
            ListNode left = node.next;
            ListNode right = node.next.next;
            // 当前指针的下一个节点变为右节点
            node.next = right;
            // 当前左节点的下个指针变成下一对的指针
            left.next = right.next;
            // 当前右节点的下一个指针指向左节点
            right.next = left;
            // 将指针移动到现在的右节点位置
            node = left;
        }
        return p.next;
    }

    /**
     * 思路：递归
     * @param head 给定链表的头节点
     * @return 两两交换后的链表头节点
     */
    public ListNode swapPairsRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 1 2举例
        // q = 2 -> null
        ListNode q = head.next;
        // head = 1 -> 2变为 1 -> null
        head.next = swapPairsRecursion(q.next);
        // q = 2 -> 1 -> null
        q.next = head;
        return q;
    }
}
