package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：206
 * 题目：反转链表
 * 链接：<a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
 * 详情：反转一个单链表
 * * 输入: 1->2->3->4->5->NULL
 * * 输出: 5->4->3->2->1->NULL
 * @author 慕勋
 * @date 2020/5/12
 */
public class LeetCode206 {

    /**
     * 思路：双指针迭代
     * @param head head节点
     * @return 反转后的链表
     */
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        // 相当于一个暂存的节点，记录上一个节点，负责下一个节点指向这个节点
        ListNode q = null;
        while (head != null) {
            p = new ListNode(head.val);
            p.next = q;
            q = p;
            head = head.next;
        }
        return p;
    }

    /**
     * 思路：递归
     * @param head head节点
     * @return 反转后的链表
     */
    public ListNode reverseListByRecursion(ListNode head) {
        // 到达链表的末尾需要进行返回
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = reverseListByRecursion(head);
        // 当前节点的下一个节点是当前节点，避免循环处理，下一个节点需要置为null
        head.next.next = head;
        head.next = null;
        return current;
    }
}
