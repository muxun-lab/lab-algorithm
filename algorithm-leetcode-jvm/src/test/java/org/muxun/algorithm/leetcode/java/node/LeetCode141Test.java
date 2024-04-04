package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/31
 */
@DisplayName("环形链表测试用例")
public class LeetCode141Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = second;
        boolean res = new LeetCode141().hasCycle(head);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        second.next = head;
        boolean res = new LeetCode141().hasCycle(head);
        boolean expected = true;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        ListNode head = new ListNode(1);
        boolean res = new LeetCode141().hasCycle(head);
        boolean expected = false;
        Assertions.assertEquals(expected, res);
    }
}
