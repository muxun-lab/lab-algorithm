package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 19
 * 题目: 删除链表的倒数第N个节点
 * 链接: <a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list">删除链表的倒数第N个节点</a>
 * 详情: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author 慕勋
 * @created 2020-02-14
 */
public class LeetCode19 {

    /**
     * 思路：双指针
     * 分别需要处理两次边界问题
     * @param head 给定的链表
     * @param n    需要删除的倒数数
     * @return 链表的头结点
     */
    public ListNode removeNthFromEndByDoublePointer(ListNode head, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode startNode = result;
        ListNode endNode = result;
        int distance = n;
        while (endNode.next != null) {
            endNode = endNode.next;
            if (distance == 0) {
                startNode = startNode.next;
            } else {
                distance--;
            }
        }
        startNode.next = startNode.next.next;
        return result.next;
    }

    /**
     * 思路：计算链表长度，然后前进l-n步
     * 分别需要处理两次边界问题
     * @param head 给定的链表
     * @param n    需要删除的倒数数
     * @return 链表的头结点
     */
    public ListNode removeNthFromEndByComputeLength(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        ListNode cur = res;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return res.next;
    }
}
