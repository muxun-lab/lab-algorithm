package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号：2
 * 题目：两数相加
 * 链接: <a href="https://leetcode.cn/problems/add-two-numbers">两数相加</a>
 * 详情：给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @author 慕勋
 * @created 2020-02-14
 */
public class LeetCode2 {

    /**
     * 思路：
     * 每一位进行操作，进位+1
     * 思路为最优思路，内存占用率低
     * @param l1 链表一
     * @param l2 链表二
     * @return 两数之和的链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            int sum = 0;
            // 处理相加
            if (l1 == null) {
                sum += l2.val;
            } else if (l2 == null) {
                sum += l1.val;
            } else {
                sum += l1.val + l2.val;
            }
            // 处理进位
            if (flag) {
                sum++;
            }
            // 判断是否有进位
            flag = sum >= 10;
            // 设置下一个节点
            result.next = new ListNode(sum % 10);
            result = result.next;
            // 移动节点
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (flag) {
            result.next = new ListNode(1);
        }
        return head.next;
    }
}
