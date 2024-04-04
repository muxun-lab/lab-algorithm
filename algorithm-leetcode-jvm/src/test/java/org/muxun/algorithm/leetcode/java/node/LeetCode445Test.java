package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("两数相加 II测试用例")
public class LeetCode445Test {

    @Test
    public void testOne() {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(8);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(7);
        ListNode res = new LeetCode445().addTwoNumbers(l1, l2);
        while (res != null) {
            Assertions.assertEquals(expected.val, res.val);
            res = res.next;
            expected = expected.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode expected = new ListNode(8);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(7);
        ListNode res = new LeetCode445().addTwoNumbers(l1, l2);
        while (res != null) {
            Assertions.assertEquals(expected.val, res.val);
            res = res.next;
            expected = expected.next;
        }
    }

    @Test
    public void testThree() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        ListNode res = new LeetCode445().addTwoNumbers(l1, l2);
        while (res != null) {
            Assertions.assertEquals(expected.val, res.val);
            res = res.next;
            expected = expected.next;
        }
    }
}
