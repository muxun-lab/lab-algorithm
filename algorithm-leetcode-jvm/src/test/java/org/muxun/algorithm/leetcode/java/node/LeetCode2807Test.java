package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("在链表中插入最大公约数测试用例")
public class LeetCode2807Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);
        ListNode expected = new ListNode(18);
        expected.next = new ListNode(6);
        expected.next.next = new ListNode(6);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(10);
        expected.next.next.next.next.next = new ListNode(1);
        expected.next.next.next.next.next.next = new ListNode(3);
        ListNode res = new LeetCode2807().insertGreatestCommonDivisors(head);
        while (res != null) {
            Assertions.assertEquals(expected.val, res.val);
            res = res.next;
            expected = expected.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(7);
        ListNode expected = new ListNode(7);
        ListNode res = new LeetCode2807().insertGreatestCommonDivisors(head);
        while (res != null) {
            Assertions.assertEquals(expected.val, res.val);
            res = res.next;
            expected = expected.next;
        }
    }
}
