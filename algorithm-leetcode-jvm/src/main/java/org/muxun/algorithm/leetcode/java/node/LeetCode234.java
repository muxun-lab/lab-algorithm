package org.muxun.algorithm.leetcode.java.node;

import java.util.Objects;

/**
 * 题号: 234
 * 题目: 回文链表
 * 链接: <a href="https://leetcode.cn/problems/palindrome-linked-list">回文链表</a>
 * 详情: 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
 * 如果是，返回 true ；否则，返回 false 。
 * @author 慕勋
 * @created 2024/2/3
 */
public class LeetCode234 {

    /**
     * 思路: 双指针
     * 找到链表的中间节点
     * 反转后半部分链表
     * 比较两段链表是否相同
     * @param head 头节点
     * @return 是否是回文链表
     */
    public boolean isPalindrome(ListNode head) {
        if (Objects.isNull(head)) {
            return true;
        }
        ListNode mid = findMid(head);
        ListNode q = reverse(mid.next);
        return isSame(head, q);
    }

    /**
     * 寻找链表的中间节点
     * @param head 头节点
     * @return 中间节点
     */
    private ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 反转链表，本质上和交换值的概念是一样的
     * @param head 头节点
     * @return 反转链表
     */
    private ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     * 比较两段链表是否相同
     * @param p 链表
     * @param q 链表
     * @return 是否相同
     */
    private boolean isSame(ListNode p, ListNode q) {
        ListNode x = p;
        ListNode y = q;
        // 这里比较的是y，因为y比较短
        while (y != null) {
            if (x.val != y.val) {
                return false;
            }
            x = x.next;
            y = y.next;
        }
        return true;
    }
}
