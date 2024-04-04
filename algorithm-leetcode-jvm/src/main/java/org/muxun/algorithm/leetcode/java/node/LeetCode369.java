package org.muxun.algorithm.leetcode.java.node;

import java.util.LinkedList;

/**
 * 题号: 369
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/plus-one-linked-list">给单链表+1</a>
 * <p>
 * 详情: 给定一个用链表表示的非负整数， 然后将这个整数 再加上 1 。
 * <p>
 * 这些数字的存储是这样的：最高位有效的数字位于链表的首位 head 。
 * @author 慕勋
 * @created 2024/3/2
 */
public class LeetCode369 {

    /**
     * 思路: 使用栈
     * @param head 头节点
     * @return 加一的结果
     */
    public ListNode plusOne(ListNode head) {
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (!stack.isEmpty()) {
            cur = stack.pop();
            if (cur.val == 9) {
                cur.val = 0;
            } else {
                cur.val += 1;
                return head;
            }
        }
        ListNode p = new ListNode(1);
        p.next = head;
        return p;
    }
}
