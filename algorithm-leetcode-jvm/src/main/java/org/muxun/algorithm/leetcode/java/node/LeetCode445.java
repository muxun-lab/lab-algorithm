package org.muxun.algorithm.leetcode.java.node;

import java.util.LinkedList;

/**
 * 题号: 445
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/add-two-numbers-ii">两数相加 II</a>
 * <p>
 * 详情: 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode445 {

    /**
     * 思路: 栈
     * @param l1 链表A
     * @param l2 链表B
     * @return 两个链表之和
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<ListNode> firstList = new LinkedList<>();
        LinkedList<ListNode> secondList = new LinkedList<>();
        ListNode p = l1;
        ListNode q = l2;
        while (p != null) {
            firstList.push(p);
            p = p.next;
        }
        while (q != null) {
            secondList.push(q);
            q = q.next;
        }
        int carry = 0;
        ListNode res = null;
        while (!firstList.isEmpty() || !secondList.isEmpty() || carry != 0) {
            int first = firstList.isEmpty() ? 0 : firstList.pop().val;
            int second = secondList.isEmpty() ? 0 : secondList.pop().val;
            int sum = first + second + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode cur = new ListNode(sum);
            cur.next = res;
            res = cur;
        }
        return res;
    }
}
