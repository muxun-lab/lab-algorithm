package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 2807
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/insert-greatest-common-divisors-in-linked-list">在链表中插入最大公约数</a>
 * <p>
 * 详情: 给你一个链表的头 head ，每个结点包含一个整数值。
 * <p>
 * 在相邻结点之间，请你插入一个新的结点，结点值为这两个相邻结点值的 最大公约数 。
 * <p>
 * 请你返回插入之后的链表。
 * <p>
 * 两个数的 最大公约数 是可以被两个数字整除的最大正整数。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode2807 {

    /**
     * 思路:
     * @param head 头节点
     * @return 插入最大公约数的链表
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            int gcd = gcd(p.val, q.val);
            ListNode node = new ListNode(gcd);
            p.next = node;
            node.next = q;
            p = q;
            q = q.next;
        }
        return res.next;
    }

    private int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
}
