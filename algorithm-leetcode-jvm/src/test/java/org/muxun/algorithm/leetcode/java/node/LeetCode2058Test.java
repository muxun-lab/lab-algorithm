package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("找出临界点之间的最小和最大距离测试用例")
public class LeetCode2058Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        int[] expected = {-1, -1};
        int[] res = new LeetCode2058().nodesBetweenCriticalPoints(head);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        int[] expected = {1, 3};
        int[] res = new LeetCode2058().nodesBetweenCriticalPoints(head);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testThree() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(7);
        int[] expected = {3, 3};
        int[] res = new LeetCode2058().nodesBetweenCriticalPoints(head);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testFour() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        int[] expected = {-1, -1};
        int[] res = new LeetCode2058().nodesBetweenCriticalPoints(head);
        Assertions.assertArrayEquals(expected, res);
    }
}
