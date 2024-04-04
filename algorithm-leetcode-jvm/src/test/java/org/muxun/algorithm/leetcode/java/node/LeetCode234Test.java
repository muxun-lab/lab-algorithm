package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/3
 */
@DisplayName("回文链表测试用例")
public class LeetCode234Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        boolean res = new LeetCode234().isPalindrome(head);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        boolean res = new LeetCode234().isPalindrome(head);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }
}
