package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 876
 * 题目: 链表的中间节点
 * 链接: <a href="https://leetcode.cn/problems/middle-of-the-linked-list">链表的中间节点</a>
 * 详情: 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * @author 慕勋
 * @created 2024/2/14
 */
public class LeetCode876 {

    /**
     * 思路: 快慢指针
     * @param head 头节点
     * @return 中间节点
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
