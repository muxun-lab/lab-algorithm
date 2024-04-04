package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/1/31
 */
@DisplayName("排序链表")
public class LeetCode148Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode res = new LeetCode148().sortList(head);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        while (res.next != null) {
            Assertions.assertEquals(expected.val, res.val);
            expected = expected.next;
            res = res.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        ListNode res = new LeetCode148().sortList(head);
        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        while (res.next != null) {
            Assertions.assertEquals(expected.val, res.val);
            expected = expected.next;
            res = res.next;
        }
    }

    @Test
    public void testThree() {
        ListNode head = null;
        ListNode res = new LeetCode148().sortList(head);
        Assertions.assertNull(res);
    }

    @Test
    public void testFour() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode res = new LeetCode148().sortListByMerge(head);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        while (res.next != null) {
            Assertions.assertEquals(expected.val, res.val);
            expected = expected.next;
            res = res.next;
        }
    }

    @Test
    public void testFive() {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        ListNode res = new LeetCode148().sortListByMerge(head);
        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        while (res.next != null) {
            Assertions.assertEquals(expected.val, res.val);
            expected = expected.next;
            res = res.next;
        }
    }

    @Test
    public void testSix() {
        ListNode head = null;
        ListNode res = new LeetCode148().sortListByMerge(head);
        Assertions.assertNull(res);
    }
}
