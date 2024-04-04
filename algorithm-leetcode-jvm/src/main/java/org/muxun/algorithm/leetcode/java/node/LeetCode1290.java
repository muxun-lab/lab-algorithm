package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 1290
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer">二进制链表转整数</a>
 * <p>
 * 详情: 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。
 * <p>
 * 已知此链表是一个整数数字的二进制表示形式。
 * <p>
 * 请你返回该链表所表示数字的 十进制值 。
 * @author 慕勋
 * @created 2024-03-09
 */
public class LeetCode1290 {

    /**
     * 思路: 栈+移位
     * @param head 头节点
     * @return 十进制
     */
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
