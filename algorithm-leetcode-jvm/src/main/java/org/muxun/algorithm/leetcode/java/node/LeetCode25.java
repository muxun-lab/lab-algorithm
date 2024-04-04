package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：25
 * 题目：<a href="https://leetcode-cn.com/problems/reverse-nodes-in-k-group/">K 个一组翻转链表</a>
 * 详情：给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序
 * @author 慕勋
 * @date 2020/6/3
 */
public class LeetCode25 {

    /**
     * 思路：计算区间，进行反转
     * @param head 链表head节点
     * @param k    翻转节点个数
     * @return 翻转后的链表
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count / k;
        ListNode x = p;
        ListNode y = p;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < k; j++) {
                y = y.next;
            }
            ListNode start = x.next;
            ListNode next = y.next;
            // 节点断掉，防止把后面的也reverse掉
            y.next = null;
            x.next = reverse(start);
            // 接上下一段链表
            start.next = next;
            // 重置到下一段开始之前
            x = start;
            y = x;
        }
        return p.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
