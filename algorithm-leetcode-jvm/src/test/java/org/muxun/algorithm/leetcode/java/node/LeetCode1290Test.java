package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-09
 */
@DisplayName("二进制链表转整数测试用例")
public class LeetCode1290Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        int expected = 5;
        int res = new LeetCode1290().getDecimalValue(head);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        int expected = 1;
        int res = new LeetCode1290().getDecimalValue(head);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        ListNode head = new ListNode(0);
        int expected = 0;
        int res = new LeetCode1290().getDecimalValue(head);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFour() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        int expected = 0;
        int res = new LeetCode1290().getDecimalValue(head);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testFive() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        int expected = 18880;
        int res = new LeetCode1290().getDecimalValue(head);
        Assertions.assertEquals(expected, res);
    }
}
